package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream instream = new FileInputStream(args[0]);

        int count =0;
        while(instream.available()>0){
            int n = instream.read();
            if(n>=65 && n<=90 || n>=97 && n<=122 )
                count++;

        }

        System.out.println(count);

        instream.close();
    }
}
