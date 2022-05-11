package com.company.Samos;
//Создать клас Human, добавить поля имя, возраст. Создать сеттеры и геттеры. Добавить метод sayHello(), при его вызове в консоль выводит hello everyone. Создать метод getOlder(),
// при его вызове меняется возраст, создать конструктор по умолчанию, в котором создаётся Петя, 0 лет.Добавить конструктор с парраметрами для всех полей. в методе майн создать два объекта
public class Human extends Creature {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello(){
        System.out.println("hello everyone");
    }

    public void getOlder(){
        this.age += 5;
    }

    public Human(){
        this.name = "Петя";
        this.age = 0;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    void life() {
        System.out.println(this.getName() + " life");
    }

    //Добавить наследника ворк и метод реализацию
    static class Work extends Human{
        void work(){
            System.out.println(this.getName()+ " Работает");
        }
        public Work(String name, int age){
            super(name, age);
        }
        public Work(){
        }
    }

    public void rest(){
        System.out.println(this.getName() + " Отдыхаю");
    }


}
