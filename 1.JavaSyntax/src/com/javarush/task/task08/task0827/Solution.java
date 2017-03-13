package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date currentDate = new Date(date);
        Date startDate = new Date(date);
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);

        startDate.setDate(1);
        startDate.setMonth(0);

        long time = currentDate.getTime()-startDate.getTime();
        long ms = 24*60*60*1000;

        int dayCount = (int) (time/ms);

        if(dayCount%2==0 )
            return true;
        else
            return false;
    }
}
