package com.wip.training.exercise6;

import java.util.Arrays;

public class CountrySorting {
  public static void main(String[] args) {

    String[] countries = new String[] {"India", "United Kingdom", "USA", "Australia"};
    Arrays.sort(countries);
    System.out.println("After sorting:");
    for (int i = 0; i < countries.length; i++) {
      System.out.println(countries[i]);
    }

  }


}
