package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {

    private int top;
    private int left;
    private int width;
    private int height;


    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle rec){
        this.top = rec.top;
        this.left = rec.left;
        this.width = rec.width;
        this.height = rec.height;
    }


    public static void main(String[] args) {


    }
}
