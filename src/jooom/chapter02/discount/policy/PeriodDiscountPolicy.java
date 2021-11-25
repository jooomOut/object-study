package jooom.chapter02.discount.policy;

import jooom.chapter02.Money;
import jooom.chapter02.Screening;
import jooom.chapter02.discount.condition.DiscountCondition;

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
