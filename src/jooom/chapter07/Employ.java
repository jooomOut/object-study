package jooom.chapter07;

public abstract class Employ {
    String employName;
    double basePay;

    public abstract double calculatePay(double taxRate);
    public abstract double sumOfBasePays();
}
