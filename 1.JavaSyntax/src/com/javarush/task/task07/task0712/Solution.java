package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
       int maxIndex=0;
       int minIndex=0;
        int max = 0;
        for(int i=0;i<10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int min = list.get(0).length();

        for(int i=0;i<10; i++) {

            if(max > list.get(i).length() ){
                max = list.get(i).length();
                maxIndex  = i;
            }


           if(min < list.get(i).length()) {
                min = list.get(i).length();
              minIndex = i;
           }
        }
        System.out.println(list.get(maxIndex));
        System.out.println(list.get(minIndex));

    }
}
