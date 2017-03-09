package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea id){
        System.out.println( id.getDescription());
    }

   public static class Idea{
        public String getDescription(){
            return "ssss";
        }
   }
}
