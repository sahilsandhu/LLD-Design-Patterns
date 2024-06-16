package src.strategypattern.strategy;

import src.strategypattern.strategy.DriveStrategy;

public class NormalDriveStrategyFunctionality implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Here is the normal drive");
    }

}
