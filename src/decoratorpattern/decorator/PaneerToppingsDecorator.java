package src.decoratorpattern.decorator;

import src.decoratorpattern.Pizza;

public class PaneerToppingsDecorator extends PizzaDecorator{

    public PaneerToppingsDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 35;
    }
}
