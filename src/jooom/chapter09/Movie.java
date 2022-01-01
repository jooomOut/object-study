package jooom.chapter09;

import jooom.chapter09.discount.policy.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;

    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee){
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = ServiceLocator.discountPolicy();
    }
}
