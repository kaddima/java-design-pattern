package org.example.singleton;

public class Demo {
  public static void main(String[] args) {
    System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
            "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
            "RESULT:" + "\n");

    Singleton s = Singleton.getInstance("FOO");
    Singleton s2 = Singleton.getInstance("BAR");
    System.out.println(s.value);
    System.out.println(s2.value);
  }
}
