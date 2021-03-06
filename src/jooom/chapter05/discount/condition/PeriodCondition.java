package jooom.chapter05.discount.condition;

import jooom.chapter05.Screening;
import jooom.chapter05.discount.condition.DiscountCondition;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isSatisfiedBy(Screening screening){
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.isBefore(screening.getWhenScreened().toLocalTime()) &&
                endTime.isAfter(screening.getWhenScreened().toLocalTime());
    }
}
