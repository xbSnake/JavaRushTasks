package com.javarush.task.task16.task1632;

/**
 * Created by Lementarev on 29.03.2017.
 */
public class Thread2 extends Thread {
    @Override
    public void run() {
        try{
            while(!isInterrupted()){}
            throw new InterruptedException();
        }
        catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
    }
}
