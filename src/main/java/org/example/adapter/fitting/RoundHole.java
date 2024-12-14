package org.example.adapter.fitting;

public class RoundHole {
  private double radius;

  public RoundHole(double radius){
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public boolean fits(RoundPeg peg){
    boolean result;
    return this.getRadius() >= peg.getRadius();

  }
}
