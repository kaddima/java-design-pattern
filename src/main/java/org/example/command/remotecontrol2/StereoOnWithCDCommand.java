package org.example.command.remotecontrol2;

import org.example.command.remotecontrol.Command;

public class StereoOnWithCDCommand implements Command {
  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo){
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    this.stereo.on();
    this.stereo.setCD();
    this.stereo.setVolume(4);
  }
}
