package org.example.decorator.beverage.concrete_decorator;

import org.example.decorator.beverage.Beverage;
import org.example.decorator.beverage.CondimentDecorator;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage){
    this.beverage = beverage;
  }

  public String getDescription(){
    return beverage.getDescription() + ", Mocha";
  }

  public double cost(){
    return beverage.cost() + .20;
  }
}
