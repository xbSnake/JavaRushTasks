package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int year = Integer.parseInt( reader.readLine());
        int x;
       if(year % 100 ==0 && year % 400 ==0 ||year % 100 !=0 && year % 4 == 0 )
          x= 366;
       else
           x=365;

        System.out.println("количество дней в году: "+x);

    }
}