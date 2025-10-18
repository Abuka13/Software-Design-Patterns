public class Main {
    public static void main(String[] args) {
       VehicleFactory factory1 = new TwoWheelerFactory();
       Vehicle v1 = factory1.createVehicle();
       v1.printVehicle();

       VehicleFactory factory2 = new FourWheelerFactory();
       Vehicle v2 = factory2.createVehicle();
       v2.printVehicle();

       VehicleFactory factory3 = new TruckFactory();
       Vehicle t = factory3.createVehicle();
       t.printVehicle();
    }
}