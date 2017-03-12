package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();

        map.put("xa","zzz");
        map.put("xd","cccc");
        map.put("xc","xcz");
        map.put("xzx","xcz");
        map.put("zc","cccc");
        map.put("zs","cds");
        map.put("we","aas");
        map.put("fg","fsdf");
        map.put("db","sdsd");
        map.put("cs","fdd");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count=0;
        for(Map.Entry<String, String> pair :map.entrySet())
            if(pair.getValue().equals(name))
                count++;
        return  count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count=0;
        for(Map.Entry<String, String> pair :map.entrySet())
            if(pair.getKey().equals(lastName))
                count++;
        return  count;
    }

    public static void main(String[] args) {

    }
}
