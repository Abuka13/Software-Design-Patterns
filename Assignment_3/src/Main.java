public class Main {
    public static void main(String[] args) {
        CarBuilder car = new CarAdapter();

        car.buildCar("Sedan");
        car.buildCar("SUV");
    }
}
