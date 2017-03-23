package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<>();
        String s="";

        do{
             s = reader.readLine();
             if(s.equals("user") || s.equals("loser") || s.equals("coder") || s.equals("proger"))
                 list.add(s);

        }while(s.equals("user") || s.equals("loser") || s.equals("coder") || s.equals("proger"));

        {
           for(String l : list) {
               switch (l){
                   case "user":
                       person = new Person.User(); break;
                   case "loser":
                       person = new Person.Loser();break;
                   case "coder":
                       person = new Person.Coder(); break;
                   case "proger":
                       person = new Person.Proger(); break;
                   default: person= null;

               }



               doWork(person); //вызываем doWork

           }
        }
    }

    public static void doWork(Person person) {
        if( person instanceof Person.User)
            ((Person.User) person).live();
        if( person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if( person instanceof Person.Coder)
            ((Person.Coder) person).coding();
        if( person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}
