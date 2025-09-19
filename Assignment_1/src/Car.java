////Java Code Example for Builder Pattern (1/2)
//class Car {
//    String name;
//    @Override
//    public String toString() {
//        return "The name of the car is " + name;
//    }
//}

//Java Code Example for Builder Pattern (2/2)
class Car {
    String name;

    public Car(Builder builder) {
        this.name = builder.name;
    }
    @Override
    public String toString() {
        return "The name of the car is " + name;
    }
    public static class Builder {
        private String name;
        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}