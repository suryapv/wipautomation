package com.wip.training.exercise4;

public class ArrayFunctions {

  public static void main(String[] args) {
    int[] GivenArray = new int[] {6, 4, 2, 8};
    // Find sum of the elements of the array
    int value = sum(GivenArray);
    System.out.println("Sum: " + value);

    // Find minimum value in the array
    int minValue = min(GivenArray);
    System.out.println("Minimum: " + minValue);

    // Find maximum value in the array
    int maxValue = max(GivenArray);
    System.out.println("Maximum: " + maxValue);

    // Copy to a new array
    int[] copy = copyArray(GivenArray);
    System.out.println("copied array: ");
    for (int i = 0; i < copy.length; i++) {
      System.out.println(copy[i]);
    }

    // Copy to new array from the end
    int[] copyEnd = copyArrayEnd(GivenArray);
    System.out.println("reverse array: ");
    for (int i = 0; i < copyEnd.length; i++) {
      System.out.println(copyEnd[i]);
    }

  }

  static int min(int[] GivenArray) {
    int min = GivenArray[0];
    for (int i = 1; i < GivenArray.length; i++)
      if (min > GivenArray[i])
        min = GivenArray[i];
    return min;
  }

  static int max(int[] GivenArray) {
    int max = GivenArray[0];
    for (int i = 1; i < GivenArray.length; i++)
      if (max < GivenArray[i])
        max = GivenArray[i];
    return max;
  }

  static int sum(int[] GivenArray) {
    int sum = 0;
    for (int i = 0; i < GivenArray.length; i++)
      sum += GivenArray[i];
    return sum;
  }

  static int[] copyArray(int[] GivenArray) {
    int[] copy = new int[GivenArray.length];
    for (int i = 0; i < GivenArray.length; i++) {
      copy[i] = GivenArray[i];
    }
    return copy;
  }

  static int[] copyArrayEnd(int[] GivenArray) {
    int[] copyArrayEnd = new int[GivenArray.length];
    for (int i = GivenArray.length - 1, j = 0; i >= 0; i--, j++) {
      copyArrayEnd[j] = GivenArray[i];
    }
    return copyArrayEnd;
  }



}
