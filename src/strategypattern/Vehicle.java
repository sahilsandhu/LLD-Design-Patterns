package src.strategypattern;

import src.strategypattern.strategy.DriveStrategy;
import src.strategypattern.strategy.SpeedStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    SpeedStrategy speedStrategy;
    Vehicle(DriveStrategy driveStrategy, SpeedStrategy speedStrategy){
        this.driveStrategy = driveStrategy;
        this.speedStrategy = speedStrategy;
    }

    public void getDrive(){
         driveStrategy.drive();
         speedStrategy.speed();
    }
}
