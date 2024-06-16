package src.strategypattern.strategy;

public class SedanSpeedStrategyFunctionality implements SpeedStrategy {
    @Override
    public void speed() {
        System.out.println("Here the speed is 120 km/h");
    }
}
