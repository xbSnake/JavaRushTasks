package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr = new FileInputStream(reader.readLine());
        int data;
        int max=0;
        while (fr.available()>0){
            if((data=fr.read())>max)
                max=data;
        }
        fr.close();
        System.out.println(max);


    }
}
