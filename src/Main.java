package src;


import src.decoratorpattern.MargheritaPizza;
import src.decoratorpattern.Pizza;
import src.decoratorpattern.TandooriPizza;
import src.decoratorpattern.decorator.ExtraCheeseDecorator;
import src.decoratorpattern.decorator.PanBaseDecorator;
import src.decoratorpattern.decorator.PaneerToppingsDecorator;
import src.decoratorpattern.decorator.PizzaDecorator;
import src.factorypattern.Vehicle;
import src.factorypattern.factory.Client;
import src.factorypattern.factory.ThreeWheelerFactory;
import src.factorypattern.factory.VehicleFactory;
import src.observerpattern.WeatherStation;
import src.observerpattern.observer.Observer;
import src.observerpattern.observer.PhoneObserver;
import src.observerpattern.observer.TabObserver;
import src.observerpattern.observer.TvObserver;

public class Main {
    public static void main(String[] args) {
//        System.out.println(" ----- Maruti Car ------");
//        MarutiSuzukiCar marutiSuzukiCar = new MarutiSuzukiCar();
//        marutiSuzukiCar.getDrive();
//        System.out.println(" ----- Honda Car -------");
//        HondaCar hondaCar = new HondaCar();
//        hondaCar.getDrive();
//        System.out.println("------- Porsche Car ------");
//        PorscheCar porscheCar = new PorscheCar();
//        porscheCar.getDrive();
//        System.out.println("------- Volkswagen Car -----");
//        VolkswagenCar volkswagenCar = new VolkswagenCar();
//        volkswagenCar.getDrive();
//        System.out.println(" ------- Toyota Car ---------");
//        ToyotaCar toyotaCar = new ToyotaCar();
//        toyotaCar.getDrive();

//        WeatherStation weatherStation = new WeatherStation();
//        Observer phoneObserver = new PhoneObserver();
//        Observer tvObserver = new TvObserver();
//        Observer tabObserver = new TabObserver();
//        weatherStation.addObserver(phoneObserver);
//        weatherStation.addObserver(tvObserver);
//        weatherStation.addObserver(tabObserver);
//        weatherStation.updateWeather("Sunny");

//        Pizza pizza1 = new ExtraCheeseDecorator(new PanBaseDecorator(new TandooriPizza()));
//        System.out.println("Price of Tandoori Pizza with pan base and extra cheese is : " + pizza1.cost());
//
//        Pizza pizza2 = new ExtraCheeseDecorator(new PaneerToppingsDecorator(new PanBaseDecorator(new MargheritaPizza())));
//        System.out.println("Price of Margherita Pizza with pan base, extra cheese and panner toppings is : " + pizza2.cost());

        VehicleFactory threeWheelerFactory = new ThreeWheelerFactory();
        Client twoWheelerClient = new Client(threeWheelerFactory);
        Vehicle vehicle = twoWheelerClient.getVehicle();
        System.out.println(vehicle.vehicleSpeed() +" "+ vehicle.vehicleType());
    }
}
