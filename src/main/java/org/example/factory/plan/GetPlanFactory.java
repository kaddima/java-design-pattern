package org.example.factory.plan;

public class GetPlanFactory {
  public Plan getPlan(String type){
    if(type == null){
      return null;
    }

    if(type.equalsIgnoreCase("domesticplan")){
      return new DomesticPlan();
    } else if (type.equalsIgnoreCase("commercialplan")) {
      return new CommercialPlan();
    } else if (type.equalsIgnoreCase("institutionalplan")) {
      return new InstitutionalPlan();
    }

    return null;
  }
}
