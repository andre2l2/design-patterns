package factory;

import factory.pizzas.*;

public class SimplePizzaFactory {
    Pizza pizza = null;

    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese" -> this.pizza = new CheesePizza();
            case "Peperoni" -> this.pizza = new PeperoniPizza();
            case "Calm" -> this.pizza = new ClamPizza();
            case "Veggie" -> this.pizza = new VeggiePizza();
        }

        return pizza;
    }
}
