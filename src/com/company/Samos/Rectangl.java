package com.company.Samos;

public class Rectangl extends Shape{
    public int[][] arr;

    public int[][] getArr(){
        return arr;
    }

    public void setArr(int[][] arr){
        this.arr = arr;
    }

    @Override
    public void Draw() {
        System.out.println("Прямоугольник");
    }
}
