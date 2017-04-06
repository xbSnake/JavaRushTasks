package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(args[0]);

        Map<Character, Integer > map = new TreeMap<>();

        while ((in.available()>0)) {
            char ch = (char)in.read();
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch,1);
        }

            for(Map.Entry<Character, Integer> entry: map.entrySet())
                System.out.println(entry.getKey()+" "+ entry.getValue());

    in.close();
    }
}
