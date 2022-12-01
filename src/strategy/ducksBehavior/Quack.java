package strategy.ducksBehavior;

import strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Duck sound quack");
    }
}
