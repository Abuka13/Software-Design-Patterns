public class Builder implements CarBuilder {
    private Car car = new Car();

    @Override
    public void setName(String name) {
        car.name = name;
    }
    @Override
    public void setEngine(String engine) {
        car.engine = engine;
    }

    @Override
    public void setYear(String year) {
        car.year = year;
    }

    @Override
    public void setType(String type) {
        car.type = type;
    }

    @Override
    public Car build() {
        return car;
    }
}
