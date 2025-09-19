interface Engine {
    String getType();
}

class ElectricEngine implements Engine {
    public String getType() { return "Electric"; }
}

class GasolineEngine implements Engine {
    public String getType() { return "Gasoline"; }
}
