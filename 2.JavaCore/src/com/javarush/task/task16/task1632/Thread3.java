package com.javarush.task.task16.task1632;

/**
 * Created by Lementarev on 29.03.2017.
 */
public class Thread3 extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("Ура");
            try {
                sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
