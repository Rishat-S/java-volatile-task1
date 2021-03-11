package ru.netology;

public class Box {
    private volatile boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public void openBox() {
        isOpen = true;
        System.out.println(Thread.currentThread().getName() + " opened the box");
    }

    public void closeBox() {
        isOpen = false;
        System.out.println(Thread.currentThread().getName() + " closed the box");
    }
}
