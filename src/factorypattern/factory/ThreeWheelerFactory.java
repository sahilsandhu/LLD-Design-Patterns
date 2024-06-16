package src.factorypattern.factory;

import src.factorypattern.ThreeWheelerVehicle;
import src.factorypattern.Vehicle;

public class ThreeWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new ThreeWheelerVehicle();
    }
}
