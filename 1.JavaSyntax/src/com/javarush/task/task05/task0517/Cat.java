package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private  int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.weight = 3;
        this.age = 3;
        this.color = "red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "red";

    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;

    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 3;

    }

    public static void main(String[] args) {

    }
}
