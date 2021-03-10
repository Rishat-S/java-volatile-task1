package ru.netology;

public class Toy implements Opening, Runnable {
    Box box;

    public Toy(Box box) {
        this.box = box;
    }

    @Override
    public void action() {
        System.out.println("Box closed.");
        box.setOpen(false);
    }

    @Override
    public void run() {
//        action();
    }
}
