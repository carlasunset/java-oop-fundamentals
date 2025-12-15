package Section16_Interfaces.services;

public interface OnlinePaymentService {

    public double paymentFee(double amount);

    public double interest(double amount, int months);
}
