package jooom.chapter05.discount;

import jooom.chapter05.DiscountPolicy;
import jooom.chapter05.Money;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
