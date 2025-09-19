interface Car {
    String getName();
}

class Tesla implements Car {
    public String getName() { return "Tesla"; }
}

class BMW implements Car {
    public String getName() { return "BMW"; }
}
