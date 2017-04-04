package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int count =0;
        while (fr.available()>0){
            if(fr.read()==44)
                count++;

        }
        System.out.println(count);
        fr.close();

    }
}
