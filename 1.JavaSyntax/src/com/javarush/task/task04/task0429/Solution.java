package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        int [] a = new int[3];
        int countPos=0;
        int countNeg=0;

        for(int i =0; i<3;i++)
            a[i] = Integer.parseInt(reader.readLine());

        for (int i=0; i<3;i++)
        {
            if (a[i]>0) countPos++;
            if (a[i]<0) countNeg++;
        }
        System.out.println("количество отрицательных чисел: "+countNeg);
        System.out.println("количество положительных чисел: "+countPos);
    }
}
