package org.example.strategy.sort_example;

import java.util.Arrays;
import java.util.List;

public class SorterTest {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 3, 2, 8, 1);

    Sorter sorter = new Sorter(new BubbleSortStrategy());
    sorter.sortNumbers(numbers);

    // switch to a different strategy
    sorter.setStrategy(new QuickSortStrategy());
    sorter.sortNumbers(numbers);
  }
}
