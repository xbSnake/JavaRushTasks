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

        for(int i=0;i<10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int min = list.get(0).length();
        int max = 0;

        for(int i=0;i<10; i++) {

            if( list.get(i).length()>max  ){
                max = list.get(i).length();
                maxIndex  = i;
            }


           if( list.get(i).length()< min ) {
                min = list.get(i).length();
              minIndex = i;
           }
        }
        if(minIndex<maxIndex)
            System.out.println(list.get(minIndex));
        else
            System.out.println(list.get(maxIndex));

    }
}
