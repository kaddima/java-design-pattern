package org.example.factory.plan;

//concrete product
public class InstitutionalPlan extends Plan{
  @Override
  void getRate() {
    rate = 5.50;
  }
}
