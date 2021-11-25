package jooom.chapter02.discount.condition;

import jooom.chapter02.Screening;
import jooom.chapter02.discount.condition.DiscountCondition;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence){
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
