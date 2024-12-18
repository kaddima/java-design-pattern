package org.example.factory.plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
  public static void main(String[] args) throws IOException {
    GetPlanFactory planFactory = new GetPlanFactory();
    System.out.println("Enter the name of plan from the " +
            "list\n1 - commercialplan\n2 - domesticplan\n3 - institutionalplan");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String planName = br.readLine();

    System.out.print("Enter the number of units for bill will be calculated: ");
    int units=Integer.parseInt(br.readLine());

    Plan p = planFactory.getPlan(planName);
    System.out.println("Bill amount for "+planName+" of "+units+ "units is");
    p.getRate();
    p.calculateBill(units);
  }
}
