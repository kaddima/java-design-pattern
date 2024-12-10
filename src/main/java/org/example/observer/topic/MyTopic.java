package org.example.observer.topic;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{
  private List<Observer> observers;
  private String message;
  private boolean changed;
  private final Object MUTEX = new Object();

  public MyTopic(){
    this.observers = new ArrayList<>();
  }

  @Override
  public void register(Observer o) {
    if(o == null) throw new NullPointerException("Null observer");
    synchronized (MUTEX){
      if(!observers.contains(o)) observers.add(o);
    }
  }

  @Override
  public void unregister(Observer o) {
    synchronized (MUTEX){
      observers.remove(o);
    }
  }

  @Override
  public void notifyObservers() {
    List<Observer> observerLocal = null;
    //synchronization is used to make sure any observer
    // registered after message is received is not notified
    synchronized (MUTEX){
      if(!changed) return;
      observerLocal = new ArrayList<>(this.observers);
      this.changed = false;
    }

    for (Observer obj : observerLocal){
      obj.update();
    }
  }

  @Override
  public Object getUpdate(Observer o) {
    return this.message;
  }

  //method to post message to the topic
  public void postMessage(String msg){
    System.out.println("Message posted to topic: "+ msg);
    this.message = msg;
    this.changed = true;
    notifyObservers();
  }
}
