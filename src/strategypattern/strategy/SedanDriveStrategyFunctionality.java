package src.strategypattern.strategy;

import src.strategypattern.strategy.DriveStrategy;

public class SedanDriveStrategyFunctionality implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Here is the Sedan Drive Functionality");
    }

}
