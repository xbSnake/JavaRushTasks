package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


        if (b==c && a!= b)
            System.out.println("1");
        else if (a==c && b!=a)
            System.out.println("2");
        else if(a==b && c!=a)
            System.out.println("3");

    }
}
