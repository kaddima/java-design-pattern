package org.example.command.remotecontrol;

public class SimpleRemoteControl {
  Command slot;
  public SimpleRemoteControl(){}

  public void setCommand(Command command){
    this.slot = command;
  }

  public void buttonwasPressed(){
    slot.execute();
  }
}
