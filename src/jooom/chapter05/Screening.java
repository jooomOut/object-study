package jooom.chapter05;

import java.time.LocalDateTime;

/**
 * 협력의 관점에서 예매하라는 메시지에 응답할 수 있어야 함
 * */
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    /*협력의 관점에서 예매하라는 메시지에 응답할 수 있어야 함*/
    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public int getSequence(){
        return sequence;
    }

    public LocalDateTime getWhenScreened(){
        return whenScreened;
    }

    /*금액 계산은 Movie에게 위임한다.*/
    private Money calculateFee(int audienceCount){
        return movie.calculateMovieFee(this).times(audienceCount);
    }

}
