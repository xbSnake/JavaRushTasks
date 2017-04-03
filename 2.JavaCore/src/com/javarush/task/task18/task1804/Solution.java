package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fr = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());


        int[] array = new int[256];

        while (fr.available()>0)
            array[fr.read()]++;

        int mincount=0;

        for(int i=0; i<256; i++){
            if(array[i]>0){
                mincount=array[i];
                break;
            }

        }

        for(int i =1; i<array.length; i++)
            if(array[i]<mincount && array[i]>0 )
                mincount=array[i];

        for(int i=0; i<array.length;i++)
            if(array[i]==mincount )
                System.out.print(i+" ");

        fr.close();
    }
}
