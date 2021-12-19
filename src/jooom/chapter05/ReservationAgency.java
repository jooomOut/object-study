package jooom.chapter05;

import jooom.chapter05.discount.condition.DiscountCondition;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount){
        boolean discountable = checkDiscountable(screening);
        Money fee = calculateFee(screening, discountable, audienceCount);
        return createReservation(screening, customer, audienceCount, fee);
    }

    private boolean checkDiscountable(Screening screening){
        return screening.getMovie().getDiscountConditions().stream().anyMatch(condition -> isDiscountable(condition, screening));
    }

    private boolean isDiscountable(DiscountCondition condition, Screening screening){
        return condition.isSatisfiedBy(screening);
    }
    private Money calculateFee(Screening screening, boolean discountable, int audienceCount){
        if (discountable){
            return screening.getMovie().calculateMovieFee(screening).times(audienceCount);
        }
        return screening.getMovie().getFee().times(audienceCount);
    }
    private Reservation createReservation(Screening screening, Customer customer, int audienceCount, Money fee){
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
