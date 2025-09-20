public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        EngineFactory engineFactory = new EngineFactory();

        Car tesla3 = carFactory.createCar("Tesla3");
        Engine electric = engineFactory.createEngine("Electric");

        Car bmwX5 = carFactory.createCar("BMWX5");
        Engine gasoline = engineFactory.createEngine("Gasoline");

        System.out.println(tesla3.getName() + " + " + electric.getType());
        System.out.println(bmwX5.getName() + " + " + gasoline.getType());

        CarCompanyFactory teslaFactory = new TeslaFactory();
        CarCompanyFactory bmwFactory = new BMWFactory();

        Car teslaS = teslaFactory.createCar("TeslaS");
        Engine teslaEngine = teslaFactory.createEngine();

        Car bmwM4 = bmwFactory.createCar("BMWM4");
        Engine bmwEngine = bmwFactory.createEngine();

        System.out.println(teslaS.getName() + " + " + teslaEngine.getType());
        System.out.println(bmwM4.getName() + " + " + bmwEngine.getType());
    }
}
