package jooom.chapter05.discount.condition;

import jooom.chapter05.Screening;
import jooom.chapter05.discount.condition.DiscountCondition;

public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public boolean isSatisfiedBy(Screening screening){
        return sequence == screening.getSequence();
    }
}
