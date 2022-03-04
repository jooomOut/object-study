package jooom.chapter14.phone.policy;

import jooom.chapter14.phone.Money;

;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
