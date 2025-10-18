class ReceiptService {
    public void sendReceipt() {
        System.out.println("[System] Receipt sent to email.");
    }
}

class NotificationService {
    public void notifyCustomer() {
        System.out.println("[System] Notification sent to customer.");
    }
}

class CheckoutFacade {
    private final ReceiptService receiptService = new ReceiptService();
    private final NotificationService notificationService = new NotificationService();

    public void processOrder(String customer, Payment payment, double amount) {
        System.out.println("Processing order for " + customer);
        System.out.println(payment.pay(amount));
        receiptService.sendReceipt();
        notificationService.notifyCustomer();
        System.out.println("Order completed.\n");
    }
}
