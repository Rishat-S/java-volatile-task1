package ru.netology;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Opening gamer = new Gamer(box);
        Opening toy = new Toy(box);

        new Thread(toy::action).start();

        for (int i = 0; i < 6; i++) {
            new Thread(gamer::action).start();
        }
    }
}
