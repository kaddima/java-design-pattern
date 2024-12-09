package org.example.strategy.duck_example;

public class FlyNoWay implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("i can't fly");
  }
}
