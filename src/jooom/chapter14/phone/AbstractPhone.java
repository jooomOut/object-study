package jooom.chapter14.phone;

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
    public List<Call> getCalls(){
        return this.calls;
    }
    abstract protected Money calculateCallFee(Call call);
    abstract protected Money afterCalculated(Money fee);
}
