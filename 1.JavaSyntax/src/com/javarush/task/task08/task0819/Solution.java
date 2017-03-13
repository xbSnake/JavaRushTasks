package com.javarush.task.task08.task0819;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();

      iterator.next();
      cats.remove(iterator);

        printCats(cats);
    }

    public static Set<Cat> createCats() {

        HashSet<Cat> set = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator<Cat> iterator = cats.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    // step 1 - пункт 1
    public static  class Cat{


    }
}
