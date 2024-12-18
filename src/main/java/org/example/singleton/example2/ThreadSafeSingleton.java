package org.example.singleton.example2;
/**
 * A simple way to create a thread-safe singleton class
 * is to make the global access method synchronized so
 * that only one thread can execute this method at a time.
 * */
public class ThreadSafeSingleton {
  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton(){}

  public static synchronized ThreadSafeSingleton getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }

  public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
