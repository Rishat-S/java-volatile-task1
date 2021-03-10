package ru.netology;

public class Gamer implements Opening, Runnable {
    Box box;

    public Gamer(Box box) {
        this.box = box;
    }

    @Override
    public void action() {
        System.out.println("Box open");
        box.setOpen(true);
    }

    @Override
    public void run() {
//        action();
    }
}
