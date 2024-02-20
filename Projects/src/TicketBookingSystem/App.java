package TicketBookingSystem;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Book a ticket");
            //System.out.println("2. Cancel a ticket");
            System.out.println("2. Print all tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                //case 2:
                    //cancelTicket();
                    //break;
                case 2:
                    printAllTickets();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }

    public static void bookTicket(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String date = in.nextLine();
        System.out.print("Enter the from location: ");
        int from = in.nextInt();
        System.out.print("Enter the to location: ");
        int to = in.nextInt();
        System.out.print("Enter the number of passengers: ");
        int numPassengers = in.nextInt();
        System.out.print("Enter the number of adults: ");
        int numAdults = in.nextInt();
        System.out.print("Enter the number of children: ");
        int numChildren = in.nextInt();
        System.out.print("Enter the number of seniors: ");
        int numSeniors = in.nextInt();
        Bus bus = new Bus(date, from, to, numPassengers);
        bus.bookSeatAdult(from, to, numAdults, date);
        bus.bookSeatChild(from, to, numChildren, date);
        StroreTicket storeTicket = new StroreTicket();
        storeTicket.addBusTicket(bus);
    }

    public static void printAllTickets(){
        StroreTicket storeTicket = new StroreTicket();
        storeTicket.printAllBusTickets();
    }

}
