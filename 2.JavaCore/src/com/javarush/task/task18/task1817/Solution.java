package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream instream = new FileInputStream(args[0]);
        DecimalFormat df = new DecimalFormat(".##");
        int all = instream.available();
        int spaces=0;
        double result;

        while(instream.available()>0) {

            if(instream.read()== (int)' ')
                spaces++;
        }

        result = (double) spaces/(double)all * 100;

        System.out.println(df.format(result));

        instream.close();
    }
}
