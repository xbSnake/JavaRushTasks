package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);
         final int key =5;

        while(in.available()>0){
            int b = in.read();
            if(args[0].equals("-e")){
                if(b+key <255)
                    out.write(b+key);
                else
                    out.write(b+key-255);
            }
            else if(args[0].equals("-d")){
                if(b-key >0)
                    out.write(b-key);
                else
                    out.write(b-key+255);
            }
        }
        in.close();
        out.close();

    }

}
