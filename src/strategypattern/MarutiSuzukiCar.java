package src.strategypattern;

import src.strategypattern.strategy.NormalDriveStrategyFunctionality;
import src.strategypattern.strategy.NormalSpeedStrategyFunctionality;

public class MarutiSuzukiCar extends Vehicle{
    public MarutiSuzukiCar(){
        super(new NormalDriveStrategyFunctionality(), new NormalSpeedStrategyFunctionality());
    }
}
