package com.company.Samos;

public abstract class Shape {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void Draw();

    static class Circle extends Shape{
        int[] coord = {4,5};

        @Override
        public void Draw() {
            System.out.println("Круг");
        }
    }

    static class Rectangle extends Shape{
        int [] coord = {8, 6};

        @Override
        public void Draw() {
            System.out.println("Прямоугольник");
        }
    }

}
