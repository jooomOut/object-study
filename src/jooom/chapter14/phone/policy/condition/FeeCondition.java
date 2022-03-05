package jooom.chapter14.phone.policy.condition;

import jooom.chapter14.phone.Call;
import jooom.chapter14.phone.policy.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
