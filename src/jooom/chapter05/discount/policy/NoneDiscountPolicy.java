package jooom.chapter05.discount.policy;

import jooom.chapter05.Money;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    public Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
