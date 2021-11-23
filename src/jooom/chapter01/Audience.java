package jooom.chapter01;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){
        return bag;
    }

    public Long Buy(Ticket ticket){
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L; // 현금을 주고 사지 않았으니 0원을 반환합니다.
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
