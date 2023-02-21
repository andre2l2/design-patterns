package factory.stores;

import factory.SimplePizzaFactory;
import factory.pizzas.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new SimplePizzaFactory().createPizza(type);
    }
}
