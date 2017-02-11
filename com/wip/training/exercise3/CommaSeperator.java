package com.wip.training.exercise3;

public class CommaSeperator {

    public static void main(String[] args) {
        int n = 5;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(i);
            if (i < n - 1)
                sb.append(',');

        }
        System.out.println(sb);

    }

}
