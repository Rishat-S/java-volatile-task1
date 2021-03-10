package ru.netology;

import java.util.concurrent.TimeUnit;

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
        for (int i = 0; i < 6; i++) {
            action();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
