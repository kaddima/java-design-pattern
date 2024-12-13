package org.example.singleton.example2;

public class EagerInitializedSingleton {
  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

  // private constructor to avoid client applications using the constructor
  private EagerInitializedSingleton(){}

  public static EagerInitializedSingleton getInstance() {
    return instance;
  }
}
