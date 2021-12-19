package jooom.chapter05.discount.policy;

import jooom.chapter05.Money;

public abstract class DiscountPolicy {
    public abstract Money calculateDiscountAmount();
}
