package org.example.factory.pizzastore;

public class PizzaTest {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza = nyStore.createPizza("cheese");
    System.out.println("kadima ordered a "+pizza.getName());
  }
}
