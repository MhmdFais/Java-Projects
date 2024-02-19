package TicketBookingSystem;

public class Bus {
    private String number;
    private String date;
    private String time;
    private int from;
    private int to;
    private final int totalSeats = 50;

    private int availableSeats = totalSeats;

    private final double[][] fairTable = {
            {0, 1000, 700, 217, 0},    // Colombo
            {1000, 0, 700, 217, 0},    // Jaffna
            {700, 700, 0, 40, 21},     // Anuradhapura
            {217, 217, 40, 0, 25},     // Vavuniya
            {0, 0, 21, 25, 0}          // Trincomalee}
    };

    public Bus(){}

    public Bus(String number, String date, String time, int from, int to, int availableSeats) {
        this.number = number;
        this.date = date;
        this.time = time;
        this.from = from;
        this.to = to;
        this.availableSeats = availableSeats;
    }

    private boolean isSeatAvailable() {
        return availableSeats > 0;
    }

    private int availableSeats(){
        return availableSeats;
    }

    private void bookSeat(){
        availableSeats--;
    }

    private void cancelSeat(){
        availableSeats++;
    }

    private double calculateFare(int from, int to) {
        return  fairTable[from][to];
    }

    public void bookSeatAdult(int from, int to, int numPassengers) {
        if (isSeatAvailable()) {
            if (numPassengers <= availableSeats) {
                double totalFare = calculateFare(from, to) * numPassengers;
                if (from == 3 || from == 4) { // Anuradhapura or Vavuniya
                    totalFare = totalFare * 0.25;
                }
                System.out.println("Total Fare: " + totalFare);
                bookSeat();
            } else {
                System.out.println("Not enough seats available");
            }
        } else {
            System.out.println("No seats available");
        }
    }

    public void bookSeatChild(int from, int to, int numPassengers) {
        if (isSeatAvailable()) {
            if (numPassengers <= availableSeats) {
                double totalFare = calculateFare(from, to) * numPassengers;
                totalFare = totalFare * 0.5;
                System.out.println("Total Fare: " + totalFare);
                bookSeat();
            } else {
                System.out.println("Not enough seats available");
            }
        } else {
            System.out.println("No seats available");
        }
    }
}
