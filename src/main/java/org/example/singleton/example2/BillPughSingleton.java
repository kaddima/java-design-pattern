package org.example.singleton.example2;

/**
 * This is the most widely used approach for the singleton
 * class as it doesn’t require synchronization.
 * */
public class BillPughSingleton {
  private BillPughSingleton(){}

  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE;
  }
}
