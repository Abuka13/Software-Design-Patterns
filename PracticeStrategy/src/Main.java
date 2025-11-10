public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setTotalCost(150);

        PayStrategy strategy = new PayByPayPal();
        order.processOrder(strategy);
    }
}