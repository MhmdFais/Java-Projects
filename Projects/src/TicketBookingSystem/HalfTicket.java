package TicketBookingSystem;

public class HalfTicket extends Ticket{

    public HalfTicket() {

    }
    public HalfTicket(String ticketId, String depature, String destination) {
        super(ticketId, depature, destination);
    }

    public int calculatePrice() {
        return super.calculatePrice() / 2;
    }
}
