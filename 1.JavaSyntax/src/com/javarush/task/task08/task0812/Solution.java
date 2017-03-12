package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int maxSeq = 1;
        int curreSeq = 1;

        for(int i=0; i<10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        for (int i=1; i< list.size(); i++){
            if(list.get(i)==list.get(i-1))
                curreSeq++;
            else
                curreSeq=1;

            maxSeq = curreSeq > maxSeq ? curreSeq : maxSeq;
        }
        System.out.println(maxSeq);
    }
}