package src.strategypattern;

import src.strategypattern.strategy.*;

public class ToyotaCar extends Vehicle{
    public ToyotaCar(){
        super(new SedanDriveStrategyFunctionality(), new RacerSpeedStrategyFunctionality());
    }
}
