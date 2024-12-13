package org.example.command.remotecontrol2;

public class Demo {
  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl();
    Light livigRoomLight = new Light("Living room");
    Command lightOffCommand = new LightOffCommand(livigRoomLight);
    Command lightOnCommand = new LightOnCommand(livigRoomLight);
    remote.setCommand(0,lightOnCommand, lightOffCommand);

    remote.onButtonWasPushed(0);
    remote.undoButtonWasPushed();


  }
}
