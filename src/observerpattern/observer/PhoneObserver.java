package src.observerpattern.observer;

import src.observerpattern.observer.Observer;

public class PhoneObserver implements Observer {

    private String weather;

    @Override
    public void updateWeather(String weather) {
        this.weather = weather;
        showWeather();
    }

    private void showWeather(){
        System.out.println("Weather at TV is : " + weather);
    }
}
