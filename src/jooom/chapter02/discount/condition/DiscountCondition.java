package jooom.chapter02.discount.condition;

import jooom.chapter02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
