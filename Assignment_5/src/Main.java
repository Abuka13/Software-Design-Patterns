public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment decoratedCreditCard = new FraudDetectionDecorator(new DiscountDecorator(creditCard, 10));
        CheckoutFacade creditFacade = new CheckoutFacade();
        creditFacade.processOrder("Abuka", decoratedCreditCard, 200);

        Payment paypal = new PayPalPayment();
        Payment decoratedPaypal = new CashbackDecorator(paypal, 5);
        CheckoutFacade paypalFacade = new CheckoutFacade();
        paypalFacade.processOrder("Danial", decoratedPaypal, 150);
    }
}
