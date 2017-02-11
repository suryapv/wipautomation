package com.wip.training.exercise4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaDate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date today = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -50);
        Date pastDate = cal.getTime();
        System.out.println(pastDate);
        cal.add(Calendar.DAY_OF_MONTH, -172);
        Date prevDate = cal.getTime();
        System.out.println(prevDate);
    }

}
