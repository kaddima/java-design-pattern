package org.example.factory.dish;

public class Demo {
  public static void main(String[] args) {
    //order a pizza usig the Pizza factory
    DishFactory pizzaFactory = new PizzaFactory();
    Dish pizza = pizzaFactory.createDish();
    pizza.prepare();
    pizza.serve();
  }
}
