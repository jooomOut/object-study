package jooom.chapter06;

import java.nio.file.Path;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Long setTicket(Ticket ticket){
        return bag.setTicket(ticket);
    }

    public Bag getBag(){
        return bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
