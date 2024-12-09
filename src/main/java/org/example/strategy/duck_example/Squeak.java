package org.example.strategy.duck_example;

public class Squeak implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
