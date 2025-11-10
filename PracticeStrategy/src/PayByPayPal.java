public class PayByPayPal implements PayStrategy {
    public void collectPaymentDetails() {
        System.out.println("Logging into PayPal account...");
    }
    public boolean pay(int amount) {
        System.out.println("Paying $" + amount + " using Paypal");
        return true;
    }
}
