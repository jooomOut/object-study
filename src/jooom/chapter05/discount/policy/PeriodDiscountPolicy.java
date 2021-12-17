package jooom.chapter05.discount.policy;

import jooom.chapter05.Money;
import jooom.chapter05.Screening;
import jooom.chapter05.discount.condition.DiscountCondition;

public class PeriodDiscountPolicy extends DiscountPolicy {
    private double percent;

    public PeriodDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
