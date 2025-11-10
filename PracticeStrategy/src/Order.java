public class Order {
    private int totalCost = 0;
    public void setTotalCost(int cost) {
        totalCost+=cost;
    }
    public int getTotalCost() {
        return totalCost;
    }
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        if (strategy.pay(totalCost)) {
            System.out.println("Succesfully");
        } else {
            System.out.println("Failed");
        }

    }
}
