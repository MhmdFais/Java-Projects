package TicketBookingSystem;

public class Ticket {
    private String ticketId;
    private String ticketType;
    private String ticketStatus;
    private String ticketDescription;
    private String ticketPriority;
    private String ticketDate;
    private String ticketTime;
    private String ticketAssignedTo;
    private String ticketAssignedBy;
    private String ticketResolvedBy;
    private String ticketResolvedDate;
    private String ticketResolvedTime;
    private String ticketResolvedDescription;
    private String ticketResolvedStatus;

    public Ticket(String ticketId, String ticketType, String ticketStatus, String ticketDescription, String ticketPriority, String ticketDate, String ticketTime, String ticketAssignedTo, String ticketAssignedBy, String ticketResolvedBy, String ticketResolvedDate, String ticketResolvedTime, String ticketResolvedDescription, String ticketResolvedStatus) {
        this.ticketId = ticketId;
        this.ticketType = ticketType;
        this.ticketStatus = ticketStatus;
        this.ticketDescription = ticketDescription;
        this.ticketPriority = ticketPriority;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.ticketAssignedTo = ticketAssignedTo;
        this.ticketAssignedBy = ticketAssignedBy;
        this.ticketResolvedBy = ticketResolvedBy;
        this.ticketResolvedDate = ticketResolvedDate;
        this.ticketResolvedTime = ticketResolvedTime;
        this.ticketResolvedDescription = ticketResolvedDescription;
        this.ticketResolvedStatus = ticketResolvedStatus;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public String getTicketPriority() {
        return ticketPriority;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public String getTicketAssignedTo() {
        return ticketAssignedTo;
    }

    public String getTicketAssignedBy() {
        return ticketAssignedBy;
    }

    public String getTicketResolvedBy() {
        return ticketResolvedBy;
    }

    public String getTicketResolvedDate() {
        return ticketResolvedDate;
    }

    public String getTicketResolvedTime() {
        return ticketResolvedTime;
    }

    public String getTicketResolvedDescription() {
        return ticketResolvedDescription;
    }

    public String getTicketResolvedStatus() {
        return ticketResolvedStatus;
    }
}
