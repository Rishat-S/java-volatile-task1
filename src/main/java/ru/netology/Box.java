package ru.netology;

public class Box {
    private volatile boolean isOpen;

    public Box() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void openBox() {
        isOpen = true;
    }

    public void closeBox() {
        isOpen = false;
    }
}
