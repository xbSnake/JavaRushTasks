package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> allList = new ArrayList<>();


        for(int i =0; i<5; i++){
            allList.add(reader.readLine());
        }

        allList.remove(2);
        for(int i =allList.size()-1; i>=0; i--)
            System.out.println(allList.get(i));
    }
}


