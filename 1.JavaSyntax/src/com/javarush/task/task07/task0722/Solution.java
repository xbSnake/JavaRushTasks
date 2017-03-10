package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s="";
        ArrayList<String > list = new ArrayList<>();

       while (!s.equals("end")) {

           if(!s.equals("")) list.add(s);
           s = reader.readLine();
       }
       for(int i =0; i< list.size(); i++)
           System.out.println(list.get(i));
    }
}