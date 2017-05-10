package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 05.05.2017.
 */
public class Hippodrome {
    static Hippodrome game;
    public static void main(String[] args) throws InterruptedException {
      game = new Hippodrome(new ArrayList<Horse>()) ;
//      Horse horse1 = new Horse("horse1",3.0,0.0);
//      Horse horse2 = new Horse("horse2",3.0,0.0);
//      Horse horse3 = new Horse("horse3",3.0,0.0);
//      game.horses.add(horse1);
//      game.horses.add(horse2);
//      game.horses.add(horse3);

        game.getHorses().add(new Horse("a", 3, 0));
        game.getHorses().add(new Horse("b", 3, 0));
        game.getHorses().add(new Horse("v", 3, 0));

      game.run();
      game.printWinner();

    }

    public Horse getWinner(){
      int maxIndex =0;
      for(int i =1; i< horses.size();i++)
          if (horses.get(i).getDistance() >horses.get(i-1).getDistance() )
              maxIndex = i;
      return  horses.get(maxIndex);
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }


    public  void run() throws InterruptedException {
        for(int i=0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse h :horses) {
            h.move();
        }
    }
    public void print(){
        for (Horse h : horses)
            h.print();
        for(int i=0; i<10; i++)
            System.out.println();
    }

    private List<Horse> horses = new ArrayList<>();
    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
}
