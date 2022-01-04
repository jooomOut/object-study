package jooom.chapter11.phone.policy;

import jooom.chapter11.phone.Call;
import jooom.chapter11.phone.Money;
import jooom.chapter11.phone.Phone;

public abstract class BasicRatePolicy implements RatePolicy{

    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;

        for (Call call: phone.getCalls()){
            result.plus(calculateCallFee(call));
        }
        return result;
    }
    protected abstract Money calculateCallFee(Call call);
}
