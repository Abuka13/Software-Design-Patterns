class CarFactory {
    public Car createCar(String carType) {
        if (carType.equalsIgnoreCase("Tesla")) {
            return new Tesla();
        }
        else if (carType.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else {
            throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
}
