package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result="";

      String[] arr =s.split(" ");

      for(String st : arr) {
          if (!st.isEmpty())
              result += st.substring(0, 1).toUpperCase() + st.substring(1) + " ";
          else
              result+= " ";

      }
        System.out.println(result);



    }
}
