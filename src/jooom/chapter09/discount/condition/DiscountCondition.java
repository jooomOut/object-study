package jooom.chapter09.discount.condition;

import jooom.chapter09.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
