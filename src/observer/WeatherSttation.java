package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.StatisticsDisplay;
import observer.display.ForecastDisplay;

public class WeatherSttation {
    public static void run() {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);

        weatherData.setMeansurements(28, 30, 1);
    }
}
