package com.company.Lesson.OOP;
//создать метод createCar, в качестве параметра отправляете автомобиль, метод возвращает новый автомобиль по следующему правилу, модель авто берется от хозяина,
// марка авто берется от параметра, цвет берется от хозяина, а Л.С. берутся от параметра

class Car{
    String model;
    String marka;
    String color;
    int ls;
    public void getInfo(){
        System.out.println(this.model + " " + this.marka + " " + this.color + " " + this.ls);
        }
//
    public Car(String model, String marka, String color, int ls){
        this.marka = marka;
        this.model = model;
        this.color = color;
        this.ls = ls;
    }
    public Car(){
        this.marka = "Lada";
        this.model = "Granta";
        this.color = "white";
        this.ls = 90;
    }
    public Car createCar (Car c){
        return new Car(c.marka, this.model, this.color, c.ls );
    }
}
//
//
public class Lesson12 {
    public static void  main (String [] args){
        Car car1 = new Car();
        Car car = new Car("X7","BMW", "White", 390);
        Car car3 = car.createCar(car1);
        car3.getInfo();
    }
}
