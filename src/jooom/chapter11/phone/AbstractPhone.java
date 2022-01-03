package jooom.chapter11.phone;

import jooom.chapter10.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;
        for (Call call: calls){
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }
    abstract protected Money calculateCallFee(Call call);
}
