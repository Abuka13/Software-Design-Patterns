
public class Main {
    public static void main(String[] args) {
//          CarDirector director = new CarDirector();
//          CarBuilder builder = new Builder();
//          Car car = director.construct(builder);
//          System.out.println(car);
//
        Car car = new Car.Builder().withName("Abuka").build();
        System.out.println(car);

    }
}
