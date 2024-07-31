
public class AdapterPatternExample {

    
    public static void main(String[] args) {
        AdapterPatternExample example = new AdapterPatternExample();
        example.run();
    }
    
    public void run() {
        // Using Paypal through the adapter
        Paypal paypal = new Paypal();
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypal);
        processPayment(paypalProcessor, 150.00);

        // Using Stripe through the adapter
        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        processPayment(stripeProcessor, 250.00);

        // Using Square through the adapter
        Square square = new Square();
        PaymentProcessor squareProcessor = new SquareAdapter(square);
        processPayment(squareProcessor, 350.00);
    }

    private void processPayment(PaymentProcessor processor, double amount) {
        processor.processPayment(amount);
    }
    
}
