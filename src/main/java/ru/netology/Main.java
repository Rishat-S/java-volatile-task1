package ru.netology;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Opening gamer = new Gamer(box);
        Opening toy = new Toy(box);

        new Thread((Runnable) toy).start();
        new Thread((Runnable) gamer).start();
    }
}
