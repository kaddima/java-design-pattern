package org.example.command.remotecontrol2;

public class CeilingFanHighCommand implements Command{
  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan){
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.high();
  }

  @Override
  public void undo() {
    if (prevSpeed == CeilingFan.HIGH){
      ceilingFan.high();
    } else if (prevSpeed == CeilingFan.MEDIUM) {
      ceilingFan.medium();
    }
  }
}
