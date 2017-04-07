package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> map = new TreeMap<>();
        String  s = reader.readLine();
        String tmp = s.substring(0,s.lastIndexOf(".part"));
        FileOutputStream fout = new FileOutputStream(tmp);

        while (!s.equals("end")){

            int n = Integer.parseInt(s.substring(s.lastIndexOf("part")+4));

           map.put(n,s);
            s = reader.readLine();

        }

        for(Map.Entry<Integer, String> entry : map.entrySet()){

            FileInputStream in = new FileInputStream(entry.getValue());
            byte[] buffer = new byte[in.available()];
            int count = in.read(buffer);
            fout.write(buffer,0, count);
            in.close();
        }
        reader.close();
        fout.close();


    }
}
