package jooom.chapter14.phone.policy;

import jooom.chapter14.phone.Call;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
