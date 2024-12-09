package org.example.strategy.duck_example;

public class DuckTest {
  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    mallardDuck.performQuack();
    mallardDuck.performFly();
  }
}
