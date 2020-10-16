package ru.geekbrains.Lesson;

public class Cat {
    private String name;
    private int appetite;
    boolean full;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }

    public void eat (Plate p) {
        if ( p.decreaseFood(appetite)) {
            full = true;
            System.out.println(this.name + " is full");
        } else {
            System.out.println(this.name + " isn't full");
        }
    }

}
