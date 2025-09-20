class TeslaFactory implements CarCompanyFactory {
    private final CarFactory carFactory = new CarFactory();
    private final EngineFactory engineFactory = new EngineFactory();

    public Car createCar(String model) {
        if (model.equalsIgnoreCase("TeslaS")) {
            return carFactory.createCar("TeslaS");
        } else if (model.equalsIgnoreCase("Tesla3")) {
            return carFactory.createCar("Tesla3");
        } else {
            throw new IllegalArgumentException("There is no car with this name");
        }
    }

    public Engine createEngine() {
        return engineFactory.createEngine("Electric");
    }
}
