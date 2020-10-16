package ru.geekbrains.Lesson;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public boolean decreaseFood (int n) {
        if (this.food >= n) {
            this.food -= n;
            return true;
        } else return false;

    }

    public void addFood () {
        int add;
        Scanner scanner = new Scanner(System.in);
        add = scanner.nextInt();
        this.food += add;
    }


    public void plateInfo () {
        System.out.println("Plate  " + this.food);
    }
}
