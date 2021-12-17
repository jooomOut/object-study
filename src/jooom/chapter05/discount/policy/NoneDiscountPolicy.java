package jooom.chapter05.discount.policy;

import jooom.chapter05.Money;
import jooom.chapter05.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
