package com.wip.training.exercise4;

public class StrToChar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String value = "Automation";
        char[] ch = value.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            if (i < ch.length - 1)
                System.out.print(',');

        }
    }
}
