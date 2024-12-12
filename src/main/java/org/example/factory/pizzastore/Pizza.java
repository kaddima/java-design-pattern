package org.example.factory.pizzastore;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<>();

  void prepare(){
    System.out.println("Preparing "+name+ " pizza");
    for(String topping  : toppings){
      System.out.println(" "+topping);
    }
  }

  void bake(){
    System.out.println("Baking");
  }

  void cut(){
    System.out.println("cutting");
  }

  void box(){
    System.out.println("boxing");
  }

  public String getName() {
    return name;
  }
}
