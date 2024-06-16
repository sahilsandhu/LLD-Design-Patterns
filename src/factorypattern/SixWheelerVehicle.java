package src.factorypattern;

public class SixWheelerVehicle implements Vehicle{
    @Override
    public int vehicleSpeed() {
        return 90;
    }

    @Override
    public String vehicleType() {
        return "6 Wheeler";
    }
}
