package org.example.observer.topic;

public interface Subject {
  //method to register and unregister obsersers
  public void register(Observer o);
  public void unregister(Observer o);

  //method to notify observers of change
  public void notifyObservers();

  //method ro get updates from subject
  public Object getUpdate(Observer o);
}
