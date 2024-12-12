package org.example.factory.dish;

//concrete factory
public class SushiFactory implements DishFactory{
  @Override
  public Dish createDish() {
    return new Sushi();
  }
}
