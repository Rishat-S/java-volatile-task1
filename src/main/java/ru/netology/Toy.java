package ru.netology;

public class Toy implements Runnable {
    private boolean isRun;
    Box box;

    public Toy(Box box) {
        this.box = box;
        isRun = true;
    }

    public void stopThread() {
        isRun = false;
    }

    @Override
    public void run() {
        while (isRun) {
            while (box.isOpen()) {
                box.closeBox();
                System.out.println(Thread.currentThread().getName() + " closed the box");
            }
        }
    }
}
