package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        br.close();
        FileReader reader = new FileReader(file1);

        int count =0;
        String s="";

        while (reader.ready()) {
            char symbol = (char) reader.read();
            s += String.valueOf(symbol).toLowerCase();
        }

        s = s.replaceAll("\\p{Punct}", " ");
        s = s.replaceAll("\n", " ");

        String[] mass = s.split(" ");
        for(String s1 : mass){
            s1.trim();
            if(s1.equals("world"))
                count++;
        }
        System.out.println( count);

        br.close();
        reader.close();
    }
}
