package ru.netology;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Opening gamer = new Gamer(box);
        Opening toy = new Toy(box);

        Thread toyThread = new Thread((Runnable) toy);
        Thread gamerThread = new Thread((Runnable) gamer);

        toyThread.start();
        gamerThread.start();

       while (gamerThread.isAlive());

       toyThread.interrupt();
        System.out.println("Toy interrupted");
    }
}
