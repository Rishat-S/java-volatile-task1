package ru.netology;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Toy toy = new Toy(box);
        Gamer gamer = new Gamer(box);

        Thread thread = new Thread(toy, "Toy");
        Thread thread1 = new Thread(gamer, "Gamer");
        System.out.println("Start game");
        thread.start();
        thread1.start();

        while (thread1.isAlive());

        toy.stopThread();
        System.out.println("End game");
    }
}
