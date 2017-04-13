package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader  reader = new BufferedReader(new FileReader(br.readLine()));
        BufferedWriter  writer = new BufferedWriter(new FileWriter(br.readLine()));

        String s="";

        while (reader.ready()){

            s+=(char)(reader.read());

        }

        String[] array = s.split(" ");
        for(String str : array)
            if (isNuberic(str))
                writer.write(str+" ");

        br.close();
        reader.close();
        writer.close();
    }

    static  boolean isNuberic(String s){
        try{
            double d = Double.parseDouble(s);
            return  true;
        }
        catch (Exception e){
            return false;
        }
    }
}
