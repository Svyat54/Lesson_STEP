package com.company.Books.Step1;

public class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int y, int m, int d){
        super(n, s, y, m, d);
        bonus = 0;
    }

    public  void setBonus(double b){
        bonus = b;
    }
}
