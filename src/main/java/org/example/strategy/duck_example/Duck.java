package org.example.strategy.duck_example;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck(){}

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack(){
    quackBehavior.quack();
  }

  public void swim(){
    System.out.println("All duck floats even decoys");
  }
  public abstract void display();
}
