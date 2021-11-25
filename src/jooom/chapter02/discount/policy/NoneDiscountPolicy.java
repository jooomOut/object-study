package jooom.chapter02.discount.policy;

import jooom.chapter02.Money;
import jooom.chapter02.Screening;
import jooom.chapter02.discount.condition.DiscountCondition;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
