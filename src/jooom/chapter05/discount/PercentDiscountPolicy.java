package jooom.chapter05.discount;

import jooom.chapter05.DiscountPolicy;
import jooom.chapter05.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;
    private Money fee;

    public PercentDiscountPolicy(double percent, Money fee) {
        this.percent = percent;
        this.fee = fee;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }

    private Money getFee() {return this.fee;};
}
