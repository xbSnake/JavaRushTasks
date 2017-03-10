package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human ded1 = new Human("ded1",true,90);
        Human ded2 = new Human("ded2",true,90);
        Human baba1 = new Human("baba1",false,90);
        Human baba2 = new Human("baba2",false,90);
        Human father = new Human("father",true,40,ded1,baba1);
        Human mother = new Human("mother",false,40,ded2,baba2);
        Human child1 = new Human("child1",true,20,father,mother);
        Human child2 = new Human("child2",false,21,father,mother);
        Human child3 = new Human("child3",true,22,father,mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       Human father;
       Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















