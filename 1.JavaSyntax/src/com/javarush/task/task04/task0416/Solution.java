package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       // int min = Integer.parseInt(reader.readLine());

        double min = Double.parseDouble(reader.readLine());

        double a = min % 5;
        if (a >=0.0 && a<3.0)
            System.out.println("зелёный");
        else if (a >=3.0 && a<4.0)
            System.out.println("желтый");
        else
            System.out.println("красный");


    }
}