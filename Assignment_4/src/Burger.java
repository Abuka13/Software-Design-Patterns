abstract class Burger {
    protected Cutlet cutlet;
    protected Burger(Cutlet cutlet) {
        this.cutlet = cutlet;
    }
    public abstract void manufacture();
}
class WhiteBun extends Burger {
    public WhiteBun(Cutlet cutlet) {
        super(cutlet);
    }
    @Override
    public void manufacture() {
        System.out.println("Cooking burger with " + cutlet.getType());
    }
}
class BlackBun extends Burger {
    public BlackBun(Cutlet cutlet) {
        super(cutlet);
    }
    @Override
    public void manufacture() {
        System.out.println("Cooking burger with " + cutlet.getType());
    }
}
class BlueBun extends Burger {
    public BlueBun(Cutlet cutlet) {
        super(cutlet);
    }
    @Override
    public void manufacture() {
        System.out.println("Cooking burger with " + cutlet.getType());
    }
}