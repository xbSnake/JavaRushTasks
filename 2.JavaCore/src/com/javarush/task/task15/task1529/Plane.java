package com.javarush.task.task15.task1529;

/**
 * Created by Lementarev on 27.03.2017.
 */
public class Plane implements Flyable {
    public void fly(){}

    private int pasenger;
    public Plane(int n){
        pasenger = n;
    }
}
