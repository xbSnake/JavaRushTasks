package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[] big = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for(int i=0; i<20; i++)
            big[i] = Integer.parseInt(reader.readLine());

        for(int i=0; i<10; i++)
            small1[i] =   big[i];

        for(int i=0; i<10; i++)
            small2[i] =  big[10+i];

        for(int i=0; i<10; i++)
            System.out.println(small2[i]);
    }
}
