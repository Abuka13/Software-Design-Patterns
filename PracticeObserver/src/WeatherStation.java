import java.util.*;
public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather;
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }
    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObserver();
    }
}

class PhoneDisplay implements Observer {
    public void update(String weather) {
        System.out.println("Phone Display: weather is now " + weather);
    }
}
class TVDisplay implements Observer {
    public void update(String weather) {
        System.out.println("TV Display Display: weather is now " + weather);
    }
}


