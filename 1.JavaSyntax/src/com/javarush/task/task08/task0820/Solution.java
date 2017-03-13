package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<Cat>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);


        return set;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> set = new HashSet<Dog>();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        set.add(dog1);
        set.add(dog2);
        set.add(dog3);

        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
       HashSet<Object> set =  new HashSet<>();

       Iterator<Cat> itCat = cats.iterator();

       while(itCat.hasNext())
           set.add(itCat.next());
        Iterator<Dog> itDog = dogs.iterator();

        while(itDog.hasNext())
            set.add(itDog.next());


        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Object> iterator = pets.iterator();
        while(iterator.hasNext()) {
           Object ob = iterator.next();
            if (ob instanceof Cat) {
                pets.remove(ob);
             iterator = pets.iterator();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
      Iterator iterator = pets.iterator();

      while (iterator.hasNext())
          System.out.println(iterator.next());

    }

   public static  class Cat{}
   public  static class Dog{}

}
