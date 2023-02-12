package observer.display;

import observer.interaces.*;;

public class StatisticsDisplay implements Observer, DisplayElements {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weaherData;

    public StatisticsDisplay(Subject weaherData) {
        this.weaherData = weaherData;
        this.weaherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display() {
        System.out.println("Temperature: " + this.temperature);
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Pressure: " + this.pressure);
    }
}
