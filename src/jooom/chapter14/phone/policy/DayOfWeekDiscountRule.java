package jooom.chapter14.phone.policy;

import jooom.chapter14.phone.Money;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DayOfWeekDiscountRule {
    private List<DayOfWeek> dayOfWeeks = new ArrayList<>();
    private Duration duration = Duration.ZERO;                  // 해당 규칙의 단위 시간
    private Money amount = Money.ZERO;                          // 해당 규칙의 단위 시간당 가격

    public DayOfWeekDiscountRule(List<DayOfWeek> dayOfWeeks, Duration duration, Money amount) {
        this.dayOfWeeks = dayOfWeeks;
        this.duration = duration;
        this.amount = amount;
    }

    public Money calculate(DateTimeInterval interval){
        if (dayOfWeeks.contains(interval.getFrom().getDayOfWeek())){
            return amount.times(interval.duration().getSeconds() / duration.getSeconds());
        }

        return Money.ZERO;
    }
}
