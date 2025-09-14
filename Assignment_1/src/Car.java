//Java Code Example for Builder Pattern (1/2)
public class Car {
    String name;
    String engine;
    String year;
    String type;

    @Override
    public String toString() {
        return "The name of car is " + name + " and the engine is " + engine +
                " and it was built in " + year + " and it is " + type;
    }
}


//Java Code Example for Builder Pattern (2/2)
//class Car {
//    private final String name;
//    private final String engine;
//    private final String year;
//    private final String type;
//
//    private Car(Builder builder) {
//        this.name = builder.name;
//        this.engine = builder.engine;
//        this.year = builder.year;
//        this.type = builder.type;
//    }
//
//    @Override
//    public String toString() {
//        return "The name of car is " + name + " and the engine is " + engine +
//                " and it was built in " + year + " and it is " + type;
//    }
//    public static class Builder {
//        private  String name;
//        private  String engine;
//        private  String year;
//        private  String type;
//
//        public Builder withName(String name) {
//            this.name = name;
//            return this;
//        }
//        public Builder withEngine(String engine) {
//            this.engine = engine;
//            return this;
//        }
//        public Builder withYear(String year) {
//            this.year = year;
//            return this;
//        }
//        public Builder withType(String type) {
//            this.type = type;
//            return this;
//        }
//        public Car build() {
//            return new Car(this);
//        }
//    }
//}