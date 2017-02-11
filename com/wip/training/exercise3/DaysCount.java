package com.wip.training.exercise3;

public class DaysCount {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 530;
        int year = count / 365;
        // int rem=count%365;
        int month = count / 30;
        int days = count % 30;
        System.out.println(count + " days = " + "" + year + " yr " + month + " mn " + days + " days");

    }

}
