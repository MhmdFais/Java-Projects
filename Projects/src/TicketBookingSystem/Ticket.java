package TicketBookingSystem;

public class Ticket {
   private String ticketId;
   private String depature;
   private String destination;

   public Ticket() {

   }

    public Ticket(String ticketId, String depature, String destination) {
        this.ticketId = ticketId;
        this.depature = depature;
        this.destination = destination;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getDepature() {
        return depature;
    }

    public void setDepature(String depature) {
        this.depature = depature;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int calculatePrice() {
        if (depature.equals("Colombo") && destination.equals("Jaffna")) {
            return 1000;
        }
        else if ( depature.equals("Anurathapura") && destination.equals("Jaffna")) {
            return 700;
        }
        else if (depature.equals("Vavuniya") && destination.equals("Jaffna")) {
            return 400;
        }
        else if (depature.equals("Anurathapura") && destination.equals("Colombo")) {
            return 400;
        }
        else if (depature.equals("Vavuniya") && destination.equals("Colombo")) {
            return 700;
        }
        else {
            return 0;
        }
    }
}
