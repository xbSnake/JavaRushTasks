package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("zzz","xx");
        map.put("xxx","cc");
        map.put("xxa","ccc");
        map.put("xzx","ccc");
        map.put("asa","xx");
        map.put("qqw","weq");
        map.put("gdg","sss");
        map.put("cxc","saa");
        map.put("ecs","ass");
        map.put("zxc","dada");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String, String> pair : map.entrySet())
            list.add(pair.getValue());

        for(int i = 0; i< list.size(); i++)
            for(int j = i+1; j<list.size(); j++){

                if(list.get(j).equals(list.get(i)))
                    removeItemFromMapByValue(map, list.get(j));

            }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);

       for(Map.Entry<String, String> pair:copy.entrySet()) {
             if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        for (Map.Entry<String,String> pair : map.entrySet())
            System.out.println(pair.getKey() + " " + pair.getValue());
    }

    public static void main(String[] args) {



    }
}
