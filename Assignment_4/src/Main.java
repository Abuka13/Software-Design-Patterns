public class Main {
    public static void main(String[] args) {
        Burger WhiteBurger = new WhiteBun(new Chicken());
        WhiteBurger.manufacture();

        Burger BlackBurger = new BlackBun(new Beef());
        BlackBurger.manufacture();

        Burger BlueBurger = new BlueBun(new Fish());
        BlueBurger.manufacture();
    }
}
