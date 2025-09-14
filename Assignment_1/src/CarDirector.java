public class CarDirector {
    public Car construct(CarBuilder builder) {
        builder.setName("Toyota");
        builder.setEngine("V8");
        builder.setYear("2006");
        builder.setType("Coupe");
        return builder.build();
    }
}
