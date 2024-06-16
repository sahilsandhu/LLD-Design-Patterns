package src.strategypattern;

import src.strategypattern.strategy.RacerDriveStrategyFunctionality;
import src.strategypattern.strategy.RacerSpeedStrategyFunctionality;

public class PorscheCar extends Vehicle{
    public PorscheCar(){
        super(new RacerDriveStrategyFunctionality(), new RacerSpeedStrategyFunctionality());
    }
}
