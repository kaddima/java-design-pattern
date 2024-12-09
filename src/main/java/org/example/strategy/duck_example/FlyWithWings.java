package org.example.strategy.duck_example;

public class FlyWithWings implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("I am flying with wings");
  }
}
