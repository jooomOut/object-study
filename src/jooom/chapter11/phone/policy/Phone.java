package jooom.chapter11.phone.policy;

import jooom.chapter11.phone.Call;
import jooom.chapter11.phone.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls(){
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee(){
        return ratePolicy.calculateFee(this);
    }
}
