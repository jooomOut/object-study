package jooom.chapter09.discount.policy;

import jooom.chapter09.Money;

public abstract class DiscountPolicy {
    public abstract Money calculateDiscountAmount();
}
