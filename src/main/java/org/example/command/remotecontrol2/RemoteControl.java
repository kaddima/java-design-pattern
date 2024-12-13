package org.example.command.remotecontrol2;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;

  public RemoteControl(){
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i=0; i<7; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command
          onCommand, Command offCommand){
    this.onCommands[slot] = onCommand;
    this.offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot){
    this.onCommands[slot].execute();
    this.undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot){
    this.offCommands[slot].execute();
    this.undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed(){
    undoCommand.undo();
  }

  public String toString(){
    StringBuffer stringbuff = new StringBuffer();
    stringbuff.append("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringbuff.append("[slot "+ i + "] " + onCommands[i].getClass().getName()
        + " " + offCommands[i].getClass().getName() + "\n");
    }
    return stringbuff.toString();
  }
}
