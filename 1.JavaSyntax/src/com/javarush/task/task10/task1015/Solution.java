package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfStringList =new ArrayList[10];
        for(int i=0; i<arrayOfStringList.length;i++)
            arrayOfStringList[i] = new ArrayList<>();


        for(int i = 0; i<arrayOfStringList.length; i++)
            for (int j=0; j<10;j++)
                arrayOfStringList[i].add("String "+ j+" "+ i);
        return arrayOfStringList;

    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}