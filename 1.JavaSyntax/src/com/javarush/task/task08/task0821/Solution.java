package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {

        HashMap<String,String> map = new HashMap<>();

        map.put("ss","aa");
        map.put("ss","asad");
        map.put("asd","aa");
        map.put("fddf","nbn");
        map.put("ssd","nbnb");
        map.put("gdj","bvb");
        map.put("ssd","aa");
        map.put("jhgd","bb");
        map.put("bvn","bbbv");
        map.put("vbn","vvvb");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
