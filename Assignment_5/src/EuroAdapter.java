public class TengeAdapter implements CurrencyAdapter {
    @Override
    public double convertToUSD(double amount) {
        return amount * 0.001855;
    }
}
