package strategy.ducks;

import strategy.Duck;
import strategy.ducksBehavior.FlyNoWay;
import strategy.ducksBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Quack(), new FlyNoWay());
    }

    public void display() {
        System.out.println("Show mallard duck");
    }
}
