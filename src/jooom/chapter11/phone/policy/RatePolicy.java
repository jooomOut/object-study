package jooom.chapter11.phone.policy;

import jooom.chapter11.phone.Money;;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
