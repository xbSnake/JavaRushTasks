package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader1 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()));

        String s1 = null;
        while ((s1=reader1.readLine()) != null) {
            allLines.add(s1);
        }

        String s2 = null;
        while ((s2=reader2.readLine()) != null) {
            forRemoveLines.add(s2);
        }

        reader1.close();
        reader2.close();


       Solution sol = new Solution();
        try {
            sol.joinData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData () throws IOException {



        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
