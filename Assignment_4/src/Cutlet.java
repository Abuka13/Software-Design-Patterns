interface Cutlet {
    String getType();
}
class Chicken implements Cutlet {
    @Override
    public String getType() {
        return "Chicken cutlet";
    }
}
class Beef implements Cutlet {
    @Override
    public String getType() {
        return "Beef cutlet";
    }
}
class Fish implements Cutlet {
    @Override
    public String getType() {
        return "Fish cutlet";
    }
}