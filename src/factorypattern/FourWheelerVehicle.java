package src.factorypattern;

public class FourWheelerVehicle implements Vehicle{
    @Override
    public int vehicleSpeed() {
        return 120;
    }

    @Override
    public String vehicleType() {
        return "4 Wheeler";
    }
}
