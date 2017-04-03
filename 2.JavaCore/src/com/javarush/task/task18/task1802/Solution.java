package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr = new FileInputStream(reader.readLine());
        int data;
        int min=fr.read();
        while (fr.available()>0){
            if((data=fr.read())<min)
                min=data;
        }
        fr.close();
        System.out.println(min);
    }
}
