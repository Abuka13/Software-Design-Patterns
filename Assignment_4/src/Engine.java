interface Engine {
    String getType();
}

class PetrolEngine implements Engine {
    @Override
    public String getType() {
        return "Petrol Engine";
    }
}

class ElectricEngine implements Engine {
    @Override
    public String getType() {
        return "Electric Engine";
    }
}
