package src.strategypattern;

import src.strategypattern.strategy.NormalDriveStrategyFunctionality;
import src.strategypattern.strategy.RacerSpeedStrategyFunctionality;

public class VolkswagenCar extends Vehicle{
    public VolkswagenCar(){
        super(new NormalDriveStrategyFunctionality(), new RacerSpeedStrategyFunctionality());
    }
}
