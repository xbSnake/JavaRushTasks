package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while (reader.ready()){
            s+=(char) reader.read();
        }

        br.close();
        reader.close();

        System.out.println(s);
    }
}
