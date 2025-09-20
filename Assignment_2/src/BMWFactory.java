class BMWFactory implements CarCompanyFactory {
    private final CarFactory carFactory = new CarFactory();
    private final EngineFactory engineFactory = new EngineFactory();

    public Car createCar(String model) {
        if (model.equalsIgnoreCase("BMWX5")) {
            return carFactory.createCar("BMWX5");
        } else if (model.equalsIgnoreCase("BMWM4")) {
            return carFactory.createCar("BMWM4");
        } else {
            throw new IllegalArgumentException("There is no car with this name");
        }
    }

    public Engine createEngine() {
        return engineFactory.createEngine("Gasoline");
    }
}
