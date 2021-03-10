package ru.netology;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Toy toy = new Toy(box);
        Gamer gamer = new Gamer(box);

        Thread toyThread = new Thread(toy,"Toy");
        Thread gamerThread = new Thread(gamer, "Gamer");

        gamerThread.start();
        toyThread.start();

        while (gamerThread.isAlive()) ;

        toyThread.interrupt();
        System.out.println("Toy interrupted main");
    }
}
