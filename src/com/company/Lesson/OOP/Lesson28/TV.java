package com.company.Lesson.OOP.Lesson28;

public class TV {
    String model;
    int date;
    int price;
    double diag;
    String made;

    public int getPrice() {
        return price;
    }

    public double getDiag() {
        return diag;
    }

    public TV(String model, int date, int price, double diag, String made) {
        this.model = model;
        this.date = date;
        this.price = price;
        this.diag = diag;
        this.made = made;
    }
}
