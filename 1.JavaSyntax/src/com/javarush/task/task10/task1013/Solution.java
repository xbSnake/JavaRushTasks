package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

      public static class Human {
      private String namme;
      private int age;
      private boolean sex;
      private String lastName;
      private  String address;
      private int weight;

        public Human(String namme) {
            this.namme = namme;
        }

        public Human(String namme, int age) {
            this.namme = namme;
            this.age = age;
        }

        public Human(String namme, int age, boolean sex) {

            this.namme = namme;
            this.age = age;
            this.sex = sex;
        }

        public Human(String namme, int age, boolean sex, String lastName) {
            this.namme = namme;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
        }

        public Human(String namme, int age, boolean sex, String lastName, String address) {
            this.namme = namme;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String namme, int age, boolean sex, String lastName, String address, int weight) {
            this.namme = namme;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
            this.address = address;
            this.weight = weight;
        }

        public Human(String lastName, String address, int weight) {
            this.lastName = lastName;
            this.address = address;
            this.weight = weight;
        }

        public Human(int age, boolean sex, String address) {
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(boolean sex, String lastName, String address) {
            this.sex = sex;
            this.lastName = lastName;
            this.address = address;
        }

        public Human() {

        }
    }
}
