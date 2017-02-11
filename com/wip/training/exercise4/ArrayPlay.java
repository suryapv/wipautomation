package com.wip.training.exercise4;

import java.util.Arrays;

public class ArrayPlay {

    public static void main(String[] args) {
        int[] value = { 1, 7, 4, 8, 9 };
        int sum = 0;
        {
            Arrays.sort(value);
            int min = value[0];
            System.out.println(min);
            int max = value[value.length - 1];
            System.out.println(max);
            for (int i = 0; i < value.length; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
        int[] valueCopy = new int[value.length];

        System.out.print("Copy ");
        for (int x = 0; x < value.length; x++) {

            valueCopy[x] = value[x];
            System.out.print(valueCopy[x] + ",");

        }

        int[] revCopy = new int[value.length];

        System.out.print("\nReverse copy  ");
        for (int x = value.length - 1; x >= 0; x--) {

            revCopy[x] = value[x];
            System.out.print(valueCopy[x] + ",");
        }

        System.out.print("\nReverse in place  ");
        for (int k = 0; k < value.length / 2; k++) {

            int temp = value[k];
            value[k] = value[value.length - 1 - k];
            value[value.length - 1 - k] = temp;

        }
        // Output of the in place array
        for (int j = 0; j < value.length; j++) {
            System.out.print(value[j] + ",");

        }

    }

}