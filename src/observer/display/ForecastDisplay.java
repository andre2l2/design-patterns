package observer.display;

import observer.interaces.*;;

public class ForecastDisplay implements Observer, DisplayElements {
    private float temperature;
    private Subject weaherData;

    public ForecastDisplay(Subject weaherData) {
        this.weaherData = weaherData;
        this.weaherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.display();
    }

    public void display() {
        System.out.println("Temperature: " + this.temperature);
    }
}
