package org.example.singleton.example1;
/**
 * The same class behaves incorrectly in a multithreaded
 * environment. Multiple threads can call the creation
 * method simultaneously and get several instances of
 * Singleton class.
 * */
public class Singleton {
  private static Singleton instance;
  public String value;

  private Singleton(String value){
    //the following code emulates slow initialization
    try{
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.value = value;
  }

  public static Singleton getInstance(String value) {
    if(instance == null){
      instance = new Singleton(value);
    }
    return instance;
  }
}
