package jooom.chapter07;

public class FullTimer extends Employ{
    @Override
    public double calculatePay(double taxRate) {
        return basePay * (1-taxRate);
    }

    @Override
    public double sumOfBasePays() {
        return 0;
    }
}
