package decorator.condiments;

import decorator.CondimentDecorator;
import decorator.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + " Mocha";
    }

    public double cost() {
        return .20 + this.beverage.cost();
    }
}
