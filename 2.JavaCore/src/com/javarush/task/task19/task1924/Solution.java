package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));

        while(reader.ready()){
            String line = reader.readLine();
            String[] sarr = line.split(" ");
            for(String s : sarr){
                if (isInMap(s))
                    s = map.get(Integer.parseInt(s));
                System.out.print(s+" ");
            }
            System.out.println();

        }
        br.close();
        reader.close();

    }

     static  boolean isInMap(String s){
        try{
            int d = Integer.parseInt(s);
            if (d>=0 && d<=12)
                return true;
            else
                return false;
        }catch (Exception e){
            return false;
        }

    }

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
}
