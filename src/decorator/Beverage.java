package decorator;

public abstract class Beverage {
    public String descripition = "Unknown descripition";

    public String getDescription() {
        return this.descripition;
    }

    public abstract double cost();
}
