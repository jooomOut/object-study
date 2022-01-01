package jooom.chapter09;

import jooom.chapter09.discount.policy.DiscountPolicy;

public class ServiceLocator {
    private static ServiceLocator soleInstance = new ServiceLocator();
    private DiscountPolicy discountPolicy;

    public static DiscountPolicy discountPolicy() {
        return soleInstance.discountPolicy;
    }
    public static void provide(DiscountPolicy discountPolicy){
        soleInstance.discountPolicy = discountPolicy;
    }
    private ServiceLocator(){}

}
