public class PayByCreditCard implements PayStrategy {
    public void collectPaymentDetails() {
        System.out.println("Collecting Credit Card information...");
    }
    public boolean pay(int amount) {
        System.out.println("Paying $" + amount + " using credit card");
        return true;
    }
}
