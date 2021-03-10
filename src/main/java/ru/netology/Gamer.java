package ru.netology;

import java.util.concurrent.TimeUnit;

public class Gamer implements Runnable {
    Box box;

    public Gamer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            box.openBox();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
