package org.example.command.remotecontrol2;

public class LightOffCommand implements Command {
  Light light;

  public LightOffCommand(Light light){
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }
}
