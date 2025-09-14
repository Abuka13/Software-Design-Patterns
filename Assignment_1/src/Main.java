

// Client (клиентский код)
public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new Builder();
        Car sportsCar = director.construct(builder);
        System.out.println(sportsCar);
//        Car mediumCar = new Car.Builder()
//                .withName("Toyota")
//                .withEngine("V8")
//                .withYear("2006")
//                .withType("crossover")
//                .build();
//        Car lowCar = new Car.Builder()
//                .withName("Toyota")
//                .withEngine("V8")
//                .withYear("2006")
//                .withType("sedan")
//                .build();
//        System.out.println(mediumCar);
//        System.out.println(lowCar);


    }
}
