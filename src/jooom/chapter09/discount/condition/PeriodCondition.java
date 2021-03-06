package jooom.chapter09.discount.condition;

import jooom.chapter09.Screening;

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
