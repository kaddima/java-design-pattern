package org.example.template.network;

public abstract class Network {
  String username;
  String password;

  Network(){}

  public boolean post(String msg){
    //authenticate before posting. Every network uses a different
    // authentication method
    if(login(this.username, this.password)){
      //send the post data
      boolean result = sendData(msg.getBytes());
      logout();
      return result;
    }
    return false;
  }

  abstract boolean login(String username, String password);
  abstract boolean sendData(byte[] data);
  abstract void logout();
}
