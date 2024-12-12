package org.example.factory.plan;

//product abstract plan
public abstract class Plan {
  protected double rate;

  public void calculateBill(int units){
    System.out.println(units*rate);
  }

  abstract void getRate();
}
