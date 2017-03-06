package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int temp;
        if (b > a){
            temp = a;
            a = b;
            b = temp;
        }
        if (c > a){
            temp = a;
            a = c;
            c = temp;
        }
        if (c > b){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + " " + b + " " + c);


    }

}
