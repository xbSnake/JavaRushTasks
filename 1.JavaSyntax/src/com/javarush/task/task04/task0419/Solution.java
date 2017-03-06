package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (isgreate(a,b) >= isgreate(c,d))
            System.out.println(isgreate(a,b));
        else
            System.out.println(isgreate(c,d));


    }
    static int isgreate(int a , int b){

        int c = a>=b ? a:b;
        return c;
    }
}
