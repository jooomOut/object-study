package jooom.chapter05;

import jooom.chapter05.discount.condition.DiscountCondition;
import jooom.chapter05.discount.policy.DiscountPolicy;

import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, List<DiscountCondition> discountConditions, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = discountConditions;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee(){
        return this.fee;
    }

    public Money calculateMovieFee(Screening screening){
        if (isDiscountable(screening)){
            return fee.minus(calculateDiscountAmount());
        }
        return fee;
    }

    public void changeDiscountPolicy(DiscountPolicy newDiscountPolicy){
        this.discountPolicy = newDiscountPolicy;
    }

    private boolean isDiscountable(Screening screening){
        return discountConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private Money calculateDiscountAmount(){
        return discountPolicy.calculateDiscountAmount();
    }

}
