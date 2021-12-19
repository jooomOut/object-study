package jooom.chapter05.discount.policy;

import jooom.chapter05.Money;

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
