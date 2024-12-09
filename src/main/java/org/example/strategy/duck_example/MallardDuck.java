package org.example.strategy.duck_example;

public class MallardDuck extends Duck{

  public MallardDuck(){
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("i am a real mallard duck");
  }
}
