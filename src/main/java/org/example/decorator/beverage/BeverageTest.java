package org.example.decorator.beverage;

import org.example.decorator.beverage.concrete_decorator.Mocha;
import org.example.decorator.beverage.concrete_decorator.Whip;

public class BeverageTest {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage houseBlend = new HouseBlend();
    //decorate house blend coffee
    houseBlend = new Mocha(houseBlend);
    houseBlend = new Whip(houseBlend);

    System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

  }
}
