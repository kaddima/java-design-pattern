package org.example.observer.weatherExample;

public class WeatherTest {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionDisplay currentDisplay =
            new CurrentConditionDisplay(weatherData);
    weatherData.setMeasurements(80,45,38.3f);
  }
}
