package ru.netology;

public class Toy implements Runnable {
    Box box;

    public Toy(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Toy interrupted");
                return;
            }
            box.closeBox();
        }
    }
}
