package TicketBookingSystem;

public class FullTicket extends Ticket{

    public FullTicket() {

    }
    public FullTicket(String ticketId, String depature, String destination) {
        super(ticketId, depature, destination);
    }

    public int calculatePrice() {
        if (getDepature().equals("Anurathapura") || getDepature().equals("Vavuniya")) {
            return ( (super.calculatePrice()*25)/100 );
        }
        else {
            return super.calculatePrice();
        }
    }
}
