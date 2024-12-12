package org.example.factory.pizzastore;

public class NYPizzaStore extends PizzaStore{
  @Override
  protected Pizza createPizza(String type) {
    if(type.equals("cheese")){
      return new NYStyleCheese();
    } else if (type.equals("pepperoni")) {
      return new NYStylePepperoni();
    }else return null;
  }
}
