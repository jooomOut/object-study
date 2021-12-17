package jooom.chapter05;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class SequenceCondition implements DiscountCondition{

    private int sequence;

    public boolean isSatisfiedBy(Screening screening){
        return sequence == screening.getSequence();
    }
}
