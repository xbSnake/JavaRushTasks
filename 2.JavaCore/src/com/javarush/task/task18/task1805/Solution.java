package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        while (file.available() > 0)
        {
            list.add(file.read());
        }
        file.close();
        Collections.sort(list);

        System.out.print(list.get(0)+" ");
        for(int i=1; i<list.size();i++)
            if(list.get(i)!=list.get(i-1))
                System.out.print(list.get(i)+" ");



    }
}
