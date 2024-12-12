package org.example.singleton;
/**
 * To fix the problem, you have to synchronize threads during
 * first creation of the Singleton object.
 * */
public final class Singleton2 {
  // The field must be declared volatile so that double check lock would work
  // correctly.
  private static volatile Singleton2 instance;
  public String value;

  private Singleton2(String value){
    this.value = value;
  }

  public static Singleton2 getInstance(String value){
    // The approach taken here is called double-checked locking (DCL). It
    // exists to prevent race condition between multiple threads that may
    // attempt to get singleton instance at the same time, creating separate
    // instances as a result.
    //
    // It may seem that having the `result` variable here is completely
    // pointless. There is, however, a very important caveat when
    // implementing double-checked locking in Java, which is solved by
    // introducing this local variable.
    Singleton2 result = instance;
    if(result != null){
      return result;
    }
    synchronized (Singleton2.class){
      if(instance == null){
        instance = new Singleton2(value);
      }
      return instance;
    }
  }
}
