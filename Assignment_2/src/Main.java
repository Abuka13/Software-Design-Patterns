public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        EngineFactory engineFactory = new EngineFactory();

        Car car = carFactory.createCar("Tesla");
        Engine engine = engineFactory.createEngine("Gasoline");

        System.out.println(car.getName() + " + " + engine.getType());


        CarCompanyFactory teslaCompany = new TeslaFactory();
        CarCompanyFactory bmwCompany = new BMWFactory();

        Car teslaCar = teslaCompany.createCar();
        Engine teslaEngine = teslaCompany.createEngine();

        Car bmwCar = bmwCompany.createCar();
        Engine bmwEngine = bmwCompany.createEngine();

        System.out.println(teslaCar.getName() + " + " + teslaEngine.getType());
        System.out.println(bmwCar.getName() + " + " + bmwEngine.getType());
    }
}
