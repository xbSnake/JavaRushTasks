package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader a11 = new BufferedReader(new InputStreamReader(System.in));
        String a1 = a11.readLine();
        int a = Integer.parseInt(a1);
        String b1 = a11.readLine();
        int b = Integer.parseInt(b1);
        String c1 = a11.readLine();
        int c = Integer.parseInt(c1);
        int ser=0;
        if ((c<=b&&c>=a) || (c<=a && c>=b)){
            ser = c;
        }
        if ((b<=c&&b>=a) || (b<=a && b>=c)){
            ser = b;
        }
        if ((a<=b&&a>=c) || (a>=b && a<=c)){
            ser = a;
        }
        System.out.print(ser);
    }
}
