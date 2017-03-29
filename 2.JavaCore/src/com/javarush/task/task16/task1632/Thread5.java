package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lementarev on 29.03.2017.
 */
public class Thread5 extends Thread {
    @Override
    public void run() {
        Integer summ = 0;
        try {
            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String s = reader.readLine();
                try {
                    Integer i = Integer.parseInt(s);
                    summ += i;
                } catch (Exception e2) {
                    if ("N".equals(s)) break;
                }
            }
            System.out.println(summ);
        } catch (Exception e) {
        }
    }


}
