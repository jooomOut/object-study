package jooom.chapter05;

import java.time.Duration;
import java.util.List;

public class PercentDiscountMovie extends Movie{
    private double discountPercent;

    public PercentDiscountMovie(String title, Duration runningTime, Money fee, double discountPercent, List<DiscountCondition> discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountPercent = discountPercent;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(discountPercent);
    }
}
