package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDate = reader.readLine();

        SimpleDateFormat s1 = new SimpleDateFormat("MM/dd/yyyy");

        Date date =  s1.parse(sDate);

        SimpleDateFormat s2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(s2.format(date).toUpperCase());
    }
}
