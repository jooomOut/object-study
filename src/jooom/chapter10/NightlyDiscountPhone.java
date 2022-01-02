package jooom.chapter10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone extends Phone{
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        super(regularAmount, seconds, taxRate);
        this.nightlyAmount = nightlyAmount;
    }

    @Override
    public Money calculateFee() {
        Money result = super.calculateFee();

        Money nightFee = Money.ZERO;
        for (Call call : calls){
            if (call.getFrom().getHour() >= LATE_NIGHT_HOUR){
                nightFee = nightFee.plus(
                        getAmount().minus(nightlyAmount).times(
                                call.getDuration().getSeconds() / seconds.getSeconds()
                        )
                );
            }
        }
        return result.minus(nightFee);
    }
    public void call(Call call){
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }
}
