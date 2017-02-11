package com.wip.training.exercise2;

public class SumOfEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 100, sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers in " + n + " natural numbers = " + sum);
    }
}
