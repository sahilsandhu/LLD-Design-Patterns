package src.decoratorpattern;

public class PanerPizza implements Pizza{

    @Override
    public int cost() {
        return 180;
    }
}
