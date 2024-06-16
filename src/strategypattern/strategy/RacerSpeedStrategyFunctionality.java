package src.strategypattern.strategy;

public class RacerSpeedStrategyFunctionality implements SpeedStrategy{

    @Override
    public void speed() {
        System.out.println("Speed is of 190 km/h");
    }
}
