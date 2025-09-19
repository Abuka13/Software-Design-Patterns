class EngineFactory {
    public Engine createEngine(String engineType) {
        if (engineType.equalsIgnoreCase("Electric")) {
            return new ElectricEngine();
        }
        else if (engineType.equalsIgnoreCase("Gasoline")) {
            return new GasolineEngine();
        }
        else {
            throw new IllegalArgumentException("Invalid engine type: " + engineType);
        }
    }
}
