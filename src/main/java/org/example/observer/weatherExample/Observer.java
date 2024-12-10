package org.example.observer.weatherExample;

public interface Observer {
  public void update(float temp, float humidity, float pressure);
}
