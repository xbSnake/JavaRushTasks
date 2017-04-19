package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import sun.awt.image.BufferedImageGraphicsConfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));

        while(reader.ready()){
            StringBuffer sb = new StringBuffer(reader.readLine());
            System.out.println(sb.reverse());
        }

        br.close();
        reader.close();

    }
}
