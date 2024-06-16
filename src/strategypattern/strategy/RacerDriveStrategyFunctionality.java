package src.strategypattern.strategy;

import src.strategypattern.strategy.DriveStrategy;

public class RacerDriveStrategyFunctionality implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Here is the Racer Drive Functionality");
    }

}
