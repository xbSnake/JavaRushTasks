package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream f1 = new FileInputStream(file1);
        FileOutputStream f2 = new FileOutputStream(file2);
        FileOutputStream f3 = new FileOutputStream(file3);

        int length = f1.available()/2;

        while (f1.available()>=length+1){
            f2.write(f1.read());
        }
        while (f1.available()>0){
            f3.write(f1.read());
        }
        f1.close();
        f2.close();
        f3.close();

    }
}
