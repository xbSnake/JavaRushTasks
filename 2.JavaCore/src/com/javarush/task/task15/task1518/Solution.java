package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {
    public static Cat cat;

    public static void main(String[] args) {

    }
    public static class Cat{
        public String name;
    }

    static {
        cat = new Cat();
        cat.name ="";
        System.out.println(cat.name);
    }

}
