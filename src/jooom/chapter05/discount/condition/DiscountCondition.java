package jooom.chapter05.discount.condition;

import jooom.chapter05.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
