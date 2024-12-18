package org.example.template.beverage;

public abstract class CaffeineBeverage {
  final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  void boilWater(){
    System.out.println("Boiling water");
  }

  void pourInCup(){
    System.out.println("Pouring into cup");
  }

  abstract void brew();
  abstract void addCondiments();
}
