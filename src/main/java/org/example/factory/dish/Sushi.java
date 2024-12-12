package org.example.factory.dish;

//concrete product
public class Sushi implements Dish{
  @Override
  public void prepare() {
    System.out.println("Preparing sushi");
  }

  @Override
  public void serve() {
    System.out.println("Serving sushi...");
  }
}
