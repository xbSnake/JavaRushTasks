package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/
import java.io.*;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a=0;
        double summ=0;
        int count =-1;
        while(a !=-1){
            summ+=a;
            count++;
            a = Integer.parseInt(reader.readLine());

        }

        System.out.println((double)(summ/count));
    }
}

