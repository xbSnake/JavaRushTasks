package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reder = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        TreeSet<String> set = new TreeSet<>();
        double max = 0.0;

        while(reder.ready()){
            String s = reder.readLine();
            String[] sarr = s.split(" ");
            if(map.containsKey(sarr[0]))
                map.put(sarr[0],map.get(sarr[0])+Double.parseDouble(sarr[1]));
            else
                map.put(sarr[0],Double.parseDouble(sarr[1]));
        }

        for(Map.Entry<String,Double> pair: map.entrySet()){
            max = pair.getValue()>max ? pair.getValue() : max;
        }
        for(Map.Entry<String,Double> pair: map.entrySet()){
            if (pair.getValue()==max)
                set.add(pair.getKey());

        }
        for (String s :set)
            System.out.println(s);
        reder.close();
    }
}
