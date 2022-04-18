package com.company.Lesson.OOP.Lesson14;

import com.company.Lesson.OOP.Car;

public class sedan14 extends Car {
    private boolean bag;

    public sedan14(String model, String brand, boolean bag){
        super(model, brand);
        this.bag = bag;
    }


    public boolean inbag(){
        return bag;
    }

    public void setBag(boolean bag){
        this.bag = bag;
    }

    @Override
    public void openDoor() {
        System.out.println("Как на легковой");
    }

    @Override
    public void signalSi() {
        System.out.println("Pandora");
    }
}


//package com.company;
//public abstract class Player {
//    private int age;
//    private String name;
//    public Player(){
//
//    }
//    public Player(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
//    public abstract void attack();
//    public void getOlder(){
//        this.age++;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(age>0) {
//            this.age = age;
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//class Human extends Player{
//
//    private int rage;
//    @Override
//    public void attack(){
//        System.out.println("Атакую с помощью меча!");
//    }
//
//    @Override
//    public void setAge(int age) {
//        if (age < 100){
//            super.setAge(age);
//        }
//    }
//}
//
//class Elf extends Player{
//
//    private int mana;
//    public Elf(int age, String name, int mana) {
//        super(age,name);
//        this.mana = mana;
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("Атакую с помощью лука!");
//    }
//
//    public void castSpell(){
//        System.out.println("Использую заклинание!");
//    }
//}


