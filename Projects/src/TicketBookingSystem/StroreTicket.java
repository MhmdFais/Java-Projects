package TicketBookingSystem;

import java.util.ArrayList;

public class StroreTicket {
    private ArrayList<Bus> busTickets;

    public StroreTicket(){
    }

    public StroreTicket(ArrayList<Bus> busTickets) {
        this.busTickets = busTickets;
    }

    public void addBusTicket(Bus bus){
        busTickets.add(bus);
    }

    public void printAllBusTickets(){
        for (Bus bus: busTickets){
            System.out.println("---------------------------------");
            System.out.println(bus);
            System.out.println("---------------------------------");
        }
    }


}
