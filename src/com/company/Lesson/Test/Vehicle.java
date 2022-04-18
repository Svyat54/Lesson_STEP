package com.company.Lesson.Test;

public class Vehicle {
    public String name;
    public String color;

    public Vehicle() {
        this.name = "bicycle";
        this.color = "purple";
        System.out.println("Конструктор родителя по умолчанию");
    }

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("Конструктор родителя с параметром");
    }

    public void getInfo() {
        System.out.println(this.name + " " + this.color);
    }
}

class Car extends Vehicle {
    public int hp;

    public Car() {
        System.out.println("Конструктор дочернего класса по умолчанию");
        this.hp = 30;
    }

    public Car(String name, String color, int hp) {
        super(name, color);
        this.hp = hp;
        System.out.println("Конструктор дочернего класса с параметром");
    }

    public void getInfo() {

        System.out.println(this.name + " " + this.color + " " + this.hp);

    }
}


