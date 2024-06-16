package src.observerpattern;

import src.observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observerList;
    private String weather;

    public WeatherStation(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.updateWeather(weather);
        }
    }

    public void updateWeather(String weather){
        this.weather = weather;
        this.notifyObservers();
    }
}
