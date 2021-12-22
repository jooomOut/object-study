package jooom.chapter06;

import java.nio.file.Path;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Long setTicket(Ticket ticket){
        if (bag.hasInvitation()){
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public Bag getBag(){
        return bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
