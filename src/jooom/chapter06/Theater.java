package jooom.chapter06;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    /*
    * 디미터 법칙을 위반한 예시.
    * */
    public void enter(Audience audience){
        ticketSeller.setTicket(audience);
    }
}
