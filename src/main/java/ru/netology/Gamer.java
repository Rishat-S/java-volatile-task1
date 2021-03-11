package ru.netology;

import java.util.concurrent.TimeUnit;

public class Gamer implements Runnable {
    public static final int TIMEOUT = 3;
    Box box;

    public Gamer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                TimeUnit.SECONDS.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            box.openBox();
        }
    }
}
