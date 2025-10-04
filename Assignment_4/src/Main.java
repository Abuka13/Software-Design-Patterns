public class Main {
    public static void main(String[] args) {
        Car sedanPetrol = new Sedan(new PetrolEngine());
        sedanPetrol.manufacture();

        Car suvElectric = new SUV(new ElectricEngine());
        suvElectric.manufacture();
    }
}
