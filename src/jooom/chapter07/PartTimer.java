package jooom.chapter07;

public class PartTimer extends Employ{
    private int timeCard;


    @Override
    public double calculatePay(double taxRate) {
        return (timeCard * basePay) * (1-taxRate);
    }

    @Override
    public double sumOfBasePays() {
        return 0;
    }
}
