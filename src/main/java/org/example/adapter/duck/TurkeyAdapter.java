package org.example.adapter.duck;

public class TurkeyAdapter implements Duck{
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey){
    this.turkey = turkey;
  }
  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    turkey.fly();
  }
}
