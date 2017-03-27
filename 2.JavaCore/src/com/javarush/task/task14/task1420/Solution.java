package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nod = 0;

        int a1 = Integer.parseInt(reader.readLine());
        if (a1<=0) throw  new Exception();
        int a2 = Integer.parseInt(reader.readLine());
        if (a2<=0) throw  new Exception();

        int m=0;
       if(a1<=a2) m=a1; else  m=a2;

       for(int i=1;i<=m; i++ )
           if(a1 % i ==0 && a2% i ==0 )
               nod = i;
        System.out.println(nod);

    }
}
