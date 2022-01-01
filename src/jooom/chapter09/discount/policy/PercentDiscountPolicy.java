package jooom.chapter09.discount.policy;

import jooom.chapter09.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;
    private Money fee;

    public PercentDiscountPolicy(double percent, Money fee) {
        this.percent = percent;
        this.fee = fee;
    }

    @Override
    public Money calculateDiscountAmount() {
        return getFee().times(percent);
    }

    private Money getFee() {return this.fee;};
}
