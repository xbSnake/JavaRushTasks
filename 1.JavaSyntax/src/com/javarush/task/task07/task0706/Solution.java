package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];
        int even=0;
        int odd =0;

        for(int i=0; i<a.length; i++)
            a[i] = Integer.parseInt(reader.readLine());

        for(int i=0; i<a.length; i++){
            if(i%2==0)
                even+=a[i];
            else
                odd+=a[i];
        }
            if (even>odd )
                System.out.println("В домах с четными номерами проживает больше жителей.");
            else
                System.out.println("В домах с нечетными номерами проживает больше жителей.");



    }
}
