package jooom.chapter11.phone.policy;

import jooom.chapter11.phone.Money;
import jooom.chapter11.phone.Phone;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
