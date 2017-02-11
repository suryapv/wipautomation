package com.wip.training.exercise2;

public class TwoTable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 2;
        int i = num;

        while (i == 2) {
            int j = 0;

            while (j <= 10) {

                System.out.println(i + " * " + j + " = " + i * j);
                j += 1;
            }

            System.out.println();
            i += 2;
        }
    }
}
