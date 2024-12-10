package org.example.observer.weatherExample;

import java.util.ArrayList;

public class WeatherData implements ObserverSubject{
  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData(){
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if(i >= 0){
      observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers){
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementChanged(){
    notifyObservers();
  }

  public void setMeasurements(float temperature,
                          float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementChanged();
  }
}
