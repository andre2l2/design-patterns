package decorator.beverages;

import decorator.Beverage;

public class Expresso extends Beverage {
    public Expresso() {
        this.descripition = "Expresso";
    }

    public double cost() {
        return 1.99;
    }
}
