package jooom.chapter09.discount.policy;

import jooom.chapter09.Money;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    public Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
