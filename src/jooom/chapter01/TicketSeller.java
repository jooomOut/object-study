package jooom.chapter01;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        Ticket ticket = ticketOffice.getTicket();
        ticketOffice.plusAmount(audience.Buy(ticket));
    }
}