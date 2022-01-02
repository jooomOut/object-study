package jooom.chapter10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
    protected Money amount;
    protected Duration seconds;
    protected List<Call> calls = new ArrayList<>();
    protected double taxRate;

    public Phone(Money amount, Duration seconds, double taxRate) {
        this.amount = amount;
        this.seconds = seconds;
        this.taxRate = taxRate;
    }

    public Money calculateFee(){
        Money result = Money.ZERO;

        for (Call call : calls){
            result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
        }
        return result.plus(result.times(taxRate));
    }
    public void call(Call call){
        calls.add(call);
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public List<Call> getCalls() {
        return calls;
    }
}
