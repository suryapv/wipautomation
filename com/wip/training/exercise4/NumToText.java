package com.wip.training.exercise4;

public class NumToText {
  public static void main(String[] args) {
    int num = 463462;
    String[] digits = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine"};
    while (num > 0 && num != 0) {
      int digit = num % 10;
      System.out.println(digits[digit]);
      num = num / 10;
    }
  }
}


