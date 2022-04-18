package com.company.Lesson.OOP.Lesson16;

public class Duk16 implements ISwiming16, IFlying16 {
    String featherColor;
    int size;

    public Duk16(String featherColor, int size) {
        this.featherColor = featherColor;
        this.size = size;
    }

    @Override
    public void Swiming() {
        System.out.println("Плавает как утка");
    }

    @Override
    public void Flying() {
        System.out.println("Летает");
    }

}

