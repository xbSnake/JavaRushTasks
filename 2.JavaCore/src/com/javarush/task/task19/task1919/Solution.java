package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reder = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        while(reder.ready()){
            String s = reder.readLine();
            String[] sarr = s.split(" ");
            if(map.containsKey(sarr[0]))
                map.put(sarr[0],map.get(sarr[0])+Double.parseDouble(sarr[1]));
            else
                map.put(sarr[0],Double.parseDouble(sarr[1]));
        }

        for(Map.Entry<String,Double> pair: map.entrySet()){
            System.out.println(pair.getKey()+" "+ pair.getValue());
        }
        reder.close();
    }
}
