package org.example.strategy.ecommerce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy{
  private final BufferedReader READER = new BufferedReader(
          new InputStreamReader(System.in));
  private CreditCard card;

  @Override
  public void collectPaymentDetails() {
    try{
      System.out.print("Enter the card number: ");
      String number = READER.readLine();
      System.out.print("Enter the card expiration date 'mm/yy': ");
      String date = READER.readLine();
      System.out.print("Enter the CVV code: ");
      String cvv = READER.readLine();
      card = new CreditCard(number, date, cvv);

      //validate credit card number
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public boolean pay(int amount) {
    if (cardIsPresent()) {
      System.out.println("Paying " + amount + " using Credit Card.");
      card.setAmount(card.getAmount() - amount);
      return true;
    } else {
      return false;
    }
  }

  private boolean cardIsPresent(){
    return card != null;
  }
}
