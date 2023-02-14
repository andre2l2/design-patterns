package decorator.beverages;

import decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.descripition = "House Blend Coffee";
    }
    
    public double cost() {
        return .89;
    }
}
