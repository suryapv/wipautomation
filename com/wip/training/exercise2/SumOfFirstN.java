package com.wip.training.exercise2;

public class SumOfFirstN {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 100, i = 1, sum = 0;
        do {
            sum = sum + i;
            i += 1;
        } while (i <= n);
        System.out.print("Sum of first " + n + " natural numbers = " + sum);
    }
}
