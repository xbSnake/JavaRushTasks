package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] a = new int[10];
        int[] tmpa = new int[10];

        for(int i=0; i<10; i++)
            a[i] = Integer.parseInt(reader.readLine());

        for(int i=0; i<10; i++)
            tmpa[i]=a[i];

        for (int i=0; i<10; i++ )
            a[i] = tmpa[9-i];

        for (int i=0; i<10; i++ )
            System.out.println(a[i]);
    }
}

