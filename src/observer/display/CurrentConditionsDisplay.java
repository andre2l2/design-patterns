package observer.display;

import observer.interaces.*;

public class CurrentConditionsDisplay implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private Subject weaherData;

    public CurrentConditionsDisplay(Subject weaherData) {
        this.weaherData = weaherData;
        this.weaherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    public void display() {
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
    }
}
