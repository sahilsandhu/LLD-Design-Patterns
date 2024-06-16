package src.strategypattern;

import src.strategypattern.strategy.DriveStrategy;
import src.strategypattern.strategy.SedanDriveStrategyFunctionality;
import src.strategypattern.strategy.SedanSpeedStrategyFunctionality;

public class HondaCar extends Vehicle{
    public HondaCar(){
        super(new SedanDriveStrategyFunctionality(), new SedanSpeedStrategyFunctionality());
    }
}
