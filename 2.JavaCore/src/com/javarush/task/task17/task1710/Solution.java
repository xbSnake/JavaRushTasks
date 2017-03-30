package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();


    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if(args[0].equals("-c")){
            if(args[2].equals("м"))
                addPeople(args[1],Sex.MALE, dateFormat.parse(args[3]));
            if(args[2].equals("ж"))
                addPeople(args[1],Sex.FEMALE, dateFormat.parse(args[3]));


        }

        if(args[0].equals("-u")){
            updatePeople(Integer.parseInt(args[1]), args[2],args[3], dateFormat.parse(args[4]));

        }


        if(args[0].equals("-d")){
            removePeople(Integer.parseInt(args[1]));

        }
        if(args[0].equals("-i")){
            getPeople(Integer.parseInt(args[1]));
        }

    }


    static  void addPeople(String name, Sex sex, Date date){
        if (sex==Sex.MALE)
            allPeople.add(Person.createMale(name, date));
        if(sex==Sex.FEMALE)
            allPeople.add(Person.createFemale(name, date));

        System.out.println(allPeople.size()-1);
    }
    static void updatePeople(int id, String name, String sex, Date date){


        if (sex.equals("м"))
            allPeople.set(id, Person.createMale(name,date));
        if (sex.equals("ж"))
            allPeople.set(id, Person.createFemale(name,date));

    }
    static void removePeople(int id){
        Person person = allPeople.get(id);
        person.setName(null);
        person.setBirthDay(null);
        person.setSex(null);
    }

    static void getPeople(int id){
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
        Person person = allPeople.get(id);
        if(person.getSex()==Sex.MALE)
         System.out.println(person.getName()+" м "+ df.format(person.getBirthDay()));
        if(person.getSex()==Sex.FEMALE)
            System.out.println(person.getName()+" ж "+ df.format(person.getBirthDay()));

    }

}
