package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inFile = reader.readLine();


            while (!inFile.equals(""))
            {
                FileInputStream in = new FileInputStream(inFile);
                if (in.available() < 1000)
                {
                    in.close();
                    throw new DownloadException();

                } else
                {
                    in.close();
                    inFile = reader.readLine();
                }
            }

    }

    public static class DownloadException extends Exception {



    }
}
