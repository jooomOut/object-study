package jooom.chapter14.phone.policy.condition;

import jooom.chapter14.phone.Call;
import jooom.chapter14.phone.policy.DateTimeInterval;

import java.util.Arrays;
import java.util.List;

public class FixedFeeCondition implements FeeCondition {

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return Arrays.asList(call.getInterval());
    }
}
