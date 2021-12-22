package jooom.chapter06;

public class Bag {
    private Long amount; // 현금
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount){
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold (Ticket ticket){
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L; // 현금을 주고 사지 않았으니 0원을 반환합니다.
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation(){
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket != null;
    }

    private void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }
    private void plusAmount(Long amount){
        this.amount += amount;
    }
}
