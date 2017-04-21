package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {

        try{
            Object ob = objectStream.readObject();
            A a = (A)ob;
            return a;

        }catch (Exception e){
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }

    }

    public static void main(String[] args) {

    }
}
