package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args)
    {
        System.out.println(convertEurToUsd(10,1.5));
        System.out.println(convertEurToUsd(20,11));
    }

    public static double convertEurToUsd(int eur, double course)
    {
        double dolar = (double)(eur)*course;
        return dolar;

    }
}
