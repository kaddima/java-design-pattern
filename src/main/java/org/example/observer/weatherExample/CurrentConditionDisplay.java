package org.example.observer.weatherExample;

public class CurrentConditionDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private ObserverSubject weatherData;

  public CurrentConditionDisplay(ObserverSubject weatherData){
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("Current display condition: "+ temperature +
            "F degrees and " + humidity + "% humidity");
  }
}
