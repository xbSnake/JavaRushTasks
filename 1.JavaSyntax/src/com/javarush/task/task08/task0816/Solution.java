package com.javarush.task.task08.task0816;



import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Caosl", new Date("JANUARY 2 1999"));
        map.put("Caaol", new Date("JANUARY 2 1999"));
        map.put("Cahol", new Date("JANUARY 4 1999"));
        map.put("Camol", new Date("JANUARY 5 1999"));
        map.put("Cakol", new Date("JANUARY 6 1999"));
        map.put("Caol",  new Date("SEPTEMBER 7 1999"));
        map.put("Caotl", new Date("MAY 8 1999"));
        map.put("Caowl", new Date("JUNE 9 1959"));
        map.put("Caoel", new Date("JANUARY 10 1994"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String,Date> pair = iterator.next();
            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7) {
                map.remove(pair.getKey());
                iterator = map.entrySet().iterator();
            }

        }


       }

    public static void main(String[] args) {



    }
}
