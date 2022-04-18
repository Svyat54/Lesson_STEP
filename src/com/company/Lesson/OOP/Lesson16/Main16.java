package com.company.Lesson.OOP.Lesson16;

public class Main16 {
    public static void  main (String [] args){
        Duk16 Donald = new Duk16("Red", 2);

        Donald.Flying();
        Donald.Swiming();

    }
}


//public abstract class Vehicle {
//    public int x;
//    public abstract void move();
//    public void sound(){
//        System.out.println("Vrum vrum");
//    }
//}
//
//interface IUsingFuel{
//    void useFuel();
//}
//interface IDirtyingEnvironment{
//    void dirtEnvironment();
//}
//
//
//class Car extends Vehicle implements IUsingFuel, IDirtyingEnvironment{
//
//
//    @Override
//    public void move() {
//        System.out.println("Еду по дороге на авто");
//    }
//
//    @Override
//    public void useFuel() {
//        System.out.println("Использую 3 литра на 100км");
//    }
//
//    @Override
//    public void dirtEnvironment() {
//        System.out.println("Выхлопные газы загрязняют планету Земля");
//    }