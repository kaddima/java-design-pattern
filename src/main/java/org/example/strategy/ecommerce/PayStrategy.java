package org.example.strategy.ecommerce;

public interface PayStrategy {
  boolean pay(int amount);
  void collectPaymentDetails();
}
