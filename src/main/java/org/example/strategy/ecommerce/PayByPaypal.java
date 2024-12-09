package org.example.strategy.ecommerce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPaypal implements PayStrategy{
  private static final Map<String, String> DATA_BASE = new HashMap<>();
  private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
  private String email;
  private String password;
  private boolean signedIn;

  static {
    DATA_BASE.put("amanda1985", "user@gmail.com");
    DATA_BASE.put("qwerty", "user2@gmail.com");
  }

  /**
   * Collect customer's data
   * */
  @Override
  public void collectPaymentDetails() {
    try{
      while (!signedIn){
        System.out.println("Enter the user's email");
        email = READER.readLine();
        System.out.println("Enter the user's password");
        password = READER.readLine();

        if(verify()){
          System.out.println("Data verification has been successful");
        }else{
          System.out.println("wrong username or password");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private boolean verify(){
    setSignedIn(email.equals(DATA_BASE.get(password)));
    return signedIn;
  }

  private void setSignedIn(boolean signedIn){
    this.signedIn = signedIn;
  }

  @Override
  public boolean pay(int amount) {
    if(signedIn){
      System.out.println("Paying " + amount + " using paypal");
      return true;
    }else{
      return false;
    }
  }
}
