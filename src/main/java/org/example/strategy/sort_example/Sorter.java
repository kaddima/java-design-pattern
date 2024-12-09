package org.example.strategy.sort_example;

import java.util.List;

public class Sorter {
  private SortingStrategy strategy;

  public Sorter(SortingStrategy strategy){
    this.strategy = strategy;
  }

  public void setStrategy(SortingStrategy strategy) {
    this.strategy = strategy;
  }

  public void sortNumbers(List<Integer> numbers){
    this.strategy.sort(numbers);
  }
}
