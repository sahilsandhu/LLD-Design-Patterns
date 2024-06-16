package src.decoratorpattern.decorator;

import src.decoratorpattern.Pizza;

public class ExtraCheeseDecorator extends PizzaDecorator{

    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
         return pizza.cost() + 28;
    }
}
