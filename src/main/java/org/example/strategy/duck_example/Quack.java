package org.example.strategy.duck_example;

public class Quack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("I can quack");
  }
}
