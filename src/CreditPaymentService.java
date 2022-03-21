public class CreditPaymentService {
    public int calculate(int amount, int period) {


        double monthPercent = 9.99 / 100 / 12;


        int payment = (int) (amount * (monthPercent + monthPercent / ((Math.pow(1 + monthPercent, period) - 1))));

        System.out.println("Сумма ежемесячного платежа");

        return payment;
    }
}
