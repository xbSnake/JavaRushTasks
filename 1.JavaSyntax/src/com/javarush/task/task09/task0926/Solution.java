package com.javarush.task.task09.task0926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() throws IOException {


        ArrayList<int[]> list = new ArrayList<>();
        int[] int5 = new int[5];
        int[] int2 = new int[2];
        int[] int4 = new int[4];
        int[] int7 = new int[7];
        int[] int0 = new int[0];

        for(int i=0;i<int5.length;i++)
            int5[i] = i;

        for(int i=0;i<int2.length;i++)
            int2[i] =i;

        for(int i=0;i<int4.length;i++)
            int4[i] = i;

        for(int i=0;i<int7.length;i++)
            int7[i] = i;

        for(int i=0;i<int0.length;i++)
            int0[i] =i;

        list.add(int5);
        list.add(int2);
        list.add(int4);
        list.add(int7);
        list.add(int0);
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
