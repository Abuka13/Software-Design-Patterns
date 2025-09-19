interface CarCompanyFactory {
    Car createCar();
    Engine createEngine();
}

class TeslaFactory implements CarCompanyFactory {
    private final CarFactory carFactory = new CarFactory();
    private final EngineFactory engineFactory = new EngineFactory();

    public Car createCar() {
        return carFactory.createCar("Tesla");
    }

    public Engine createEngine() {
        return engineFactory.createEngine("Electric");
    }
}
class BMWFactory implements CarCompanyFactory {
    private final CarFactory carFactory = new CarFactory();
    private final EngineFactory engineFactory = new EngineFactory();

    public Car createCar() {
        return carFactory.createCar("BMW");
    }

    public Engine createEngine() {
        return engineFactory.createEngine("Gasoline");
    }
}
