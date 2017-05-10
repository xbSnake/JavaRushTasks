package com.javarush.task.task21.task2113;

/**
 * Created by Admin on 05.05.2017.
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    public void move(){
        distance += speed * Math.random();
    }
    public void print(){
        for(int i=0; i< (int)distance; i++)
            System.out.print(".");
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
