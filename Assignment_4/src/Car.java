abstract class Car {
    protected Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void manufacture();
}

class Sedan extends Car {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Sedan with " + engine.getType());
    }
}

class SUV extends Car {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing SUV with " + engine.getType());
    }
}
