package org.example.factory.dish;

//concrete products
public class Pizza implements Dish{
  @Override
  public void prepare() {
    System.out.println("preparing pizza...");
  }

  @Override
  public void serve() {
    System.out.println("Serving pizza...");
  }
}
