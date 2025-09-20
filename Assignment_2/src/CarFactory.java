class CarFactory {
    public Car createCar(String carType) {
        switch (carType.toLowerCase()) {
            case "teslas":
                return new TeslaModelS();
            case "tesla3":
                return new TeslaModel3();
            case "bmwx5":
                return new BMWX5();
            case "bmwm4":
                return new BMWM4();
            default:
                throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
}
