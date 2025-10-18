interface Payment {
    String pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public String pay(double amount) {
        return "Credit Card payment of $" + amount + " processed.";
    }
}

class PayPalPayment implements Payment {
    @Override
    public String pay(double amount) {
        return "PayPal payment of $" + amount + " processed.";
    }
}

abstract class PaymentDecorator implements Payment {
    protected Payment decoratedPayment;

    public PaymentDecorator(Payment decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    @Override
    public String pay(double amount) {
        return decoratedPayment.pay(amount);
    }
}

class DiscountDecorator extends PaymentDecorator {
    private double discountPercent;

    public DiscountDecorator(Payment decoratedPayment, double discountPercent) {
        super(decoratedPayment);
        this.discountPercent = discountPercent;
    }

    @Override
    public String pay(double amount) {
        double discounted = amount - (amount * discountPercent / 100);
        return "[Discount " + discountPercent + "%] New total: $" + discounted + ". " + super.pay(discounted);
    }
}

class CashbackDecorator extends PaymentDecorator {
    private double cashbackPercent;

    public CashbackDecorator(Payment decoratedPayment, double cashbackPercent) {
        super(decoratedPayment);
        this.cashbackPercent = cashbackPercent;
    }

    @Override
    public String pay(double amount) {
        double cashback = amount * cashbackPercent / 100;
        return super.pay(amount) + " Cashback earned: $" + cashback;
    }
}

class FraudDetectionDecorator extends PaymentDecorator {
    public FraudDetectionDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public String pay(double amount) {
        return "[Fraud Check OK] " + super.pay(amount);
    }
}
