package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        String s = "";


        while (!s.equals("сумма")) {
            s = reader.readLine();

            if (!s.equals("сумма"))
                summ += Integer.parseInt(s);
        }
            System.out.println(summ);

    }
}
