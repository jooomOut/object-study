package jooom.chapter10.improvement;

import jooom.chapter10.Money;

import java.time.Duration;

public class Phone extends AbstractPhone{
    private Money amount;
    private Duration seconds;

    public Phone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
