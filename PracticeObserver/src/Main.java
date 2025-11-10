//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay();
        TVDisplay tv = new TVDisplay();
        station.addObserver(phone);
        station.addObserver(tv);
        station.setWeather("sunny");
    }
}