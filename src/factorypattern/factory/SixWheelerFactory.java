package src.factorypattern.factory;

import src.factorypattern.SixWheelerVehicle;
import src.factorypattern.Vehicle;

public class SixWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new SixWheelerVehicle();
    }
}
