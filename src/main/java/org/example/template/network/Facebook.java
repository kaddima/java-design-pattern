package org.example.template.network;

public class Facebook extends Network{
  public Facebook(String username, String password){
    this.username = username;
    this.password = password;
  }

  @Override
  boolean login(String username, String password) {
    System.out.println("\nchecking user's parameters");
    System.out.println("Name: "+this.username);
    System.out.println("password: ");
    for (int i = 0; i < this.password.length(); i++) {
      System.out.print("*");
    }
    simulateNetworkLatency();
    System.out.println("\n\nLogin success on Facebook");
    return true;
  }

  @Override
  boolean sendData(byte[] data) {
    boolean messagePosted = true;
    if(messagePosted){
      System.out.println("Message '" + new String(data) +
              "' was posted on facebook");
      return true;
    }else{
      return false;
    }
  }

  @Override
  void logout() {
    System.out.println("User: '"+username + "' was logged out from" +
            " facebook");
  }

  public void simulateNetworkLatency(){
    try{
      int i = 0;
      System.out.println();
      while (i < 10){
        System.out.print(".");
        Thread.sleep(500);
        i++;
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
