public class CarAdapter implements CarBuilder {
    private final LegacyCarEngine legacyEngine = new LegacyCarEngine();

    @Override
    public void buildCar(String type) {
        switch (type.toLowerCase()) {
            case "sedan":
                legacyEngine.startEngine("petrol", 4);
                break;
            case "suv":
                legacyEngine.startEngine("diesel", 6);
                break;
            default:
                legacyEngine.startEngine("petrol", 3);
        }
    }
}
