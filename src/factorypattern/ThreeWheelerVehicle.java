package src.factorypattern;

public class ThreeWheelerVehicle implements Vehicle{
    @Override
    public int vehicleSpeed() {
        return 60;
    }

    @Override
    public String vehicleType() {
        return "3 Wheeler";
    }
}
