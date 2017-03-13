package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human kid1 = new Human("kid1",true, 16);
        Human kid2 = new Human("kid2",true, 16);
        Human kid3 = new Human("kid3",true, 16);

        ArrayList<Human> childrenList = new ArrayList<>();
        childrenList.add(kid1);
        childrenList.add(kid2);
        childrenList.add(kid3);

        Human mother = new Human("Mother",false,40, childrenList );
        Human father = new Human("Father", true, 40, childrenList);

        ArrayList<Human> momList = new ArrayList<>();
        momList.add(mother);
        ArrayList<Human> fatherList = new ArrayList<>();
        fatherList.add(father);

        Human ded1 = new Human("Ded1", true, 60, momList);
        Human baba1 = new Human("baba1", false, 60, momList);
        Human ded2 = new Human("Ded2", true, 60, fatherList);
        Human baba2 = new Human("baba2", false, 60, fatherList);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(ded1);
        System.out.println(baba1);
        System.out.println(ded2);
        System.out.println(baba2);

    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       ArrayList<Human> children ;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children = new ArrayList<>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> kids) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children =  new ArrayList(kids);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
