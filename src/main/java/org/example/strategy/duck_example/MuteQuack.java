package org.example.strategy.duck_example;

public class MuteQuack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
