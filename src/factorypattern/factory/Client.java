package src.factorypattern.factory;

import src.factorypattern.Vehicle;

public class Client {
    Vehicle vehicle;
    public Client(VehicleFactory vehicleFactory){
        this.vehicle = vehicleFactory.getVehicle();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
