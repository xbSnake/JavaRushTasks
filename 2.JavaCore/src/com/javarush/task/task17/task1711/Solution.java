package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {

            case "-c": {
                synchronized (allPeople){
                int n = (args.length - 1) / 3;
                for (int i = 1; i <= n; i++) {
                    if (args[3 * i - 1].equals("м")) addPeople(args[3 * i - 2], Sex.MALE, dateFormat.parse(args[3 * i]));
                    if (args[3 * i - 1].equals("ж")) addPeople(args[3 * i - 2], Sex.FEMALE, dateFormat.parse(args[3 * i]));
                }}

            }break;

            case"-u": {
                synchronized (allPeople) {
                    int n = (args.length - 1) / 4;
                    for (int i = 1; i <= n; i++)
                        updatePeople(Integer.parseInt(args[4 * i - 3]), args[4 * i - 2], args[4 * i - 1], dateFormat.parse(args[4 * i]));
                }
            }break;


            case"-d": {
                synchronized (allPeople) {
                    int n = args.length - 1;
                    for (int i = 1; i <= n; i++)
                        removePeople(Integer.parseInt(args[i]));
                }
            }break;
            case "-i": {
                synchronized (allPeople) {
                    int n = args.length - 1;
                    for (int i = 1; i <= n; i++)
                        getPeople(Integer.parseInt(args[i]));
                }
            }break;

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
