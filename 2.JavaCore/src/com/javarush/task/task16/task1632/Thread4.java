package com.javarush.task.task16.task1632;

/**
 * Created by Lementarev on 29.03.2017.
 */
public class Thread4 extends Thread implements Message {
    @Override
    public void run() {
       super.run();
    }

    @Override
    public void showWarning() {
       this.interrupt();

    }
}
