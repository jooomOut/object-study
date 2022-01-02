package jooom.chapter09.discount.policy;

import jooom.chapter09.Money;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount() {
        return discountAmount;
    }
}
