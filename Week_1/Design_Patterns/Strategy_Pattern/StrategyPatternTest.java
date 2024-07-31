public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("Shobika", "1234567890123456", "123", "12/26");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(250.0);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("shobika@gmail.com", "shobi123");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(150.0);
    }
}
