package jooom.chapter09.discount.condition;

import jooom.chapter09.Screening;

public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public boolean isSatisfiedBy(Screening screening){
        return sequence == screening.getSequence();
    }
}
