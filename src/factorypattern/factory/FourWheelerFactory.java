package src.factorypattern.factory;

import src.factorypattern.FourWheelerVehicle;
import src.factorypattern.Vehicle;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new FourWheelerVehicle();
    }
}
