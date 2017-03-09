package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList <String> s = new ArrayList<String>();

        for (int i =0; i<5;i++)
            s.add("ss"+i);
        System.out.println(s.size());

        for (int i =0; s.size()<5;i++)
            s.get(i);
    }
}
