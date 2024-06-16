package src.strategypattern.strategy;

import src.strategypattern.Vehicle;

public class NormalSpeedStrategyFunctionality implements SpeedStrategy {
    @Override
    public void speed() {
        System.out.println("Here the speed is 80 km/h");
    }
}
