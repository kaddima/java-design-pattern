package org.example.decorator.beverage.concrete_decorator;

import org.example.decorator.beverage.Beverage;
import org.example.decorator.beverage.CondimentDecorator;

public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip(Beverage beverage){
    this.beverage = beverage;
  }

  public String getDescription(){
    return beverage.getDescription() + ", Whip";
  }

  public double cost(){
    return beverage.cost() + .20;
  }
}
