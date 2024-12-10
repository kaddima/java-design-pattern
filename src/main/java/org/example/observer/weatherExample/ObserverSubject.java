package org.example.observer.weatherExample;

public interface ObserverSubject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}
