package com.company.Lesson.OOP.Lesson13;
import java.util.Scanner;
//Создать класс Животное (Animal). Кушать - в зависимости от типа животного должно быть напечатано в консоли О я съел мясо (в случае с тигром) с другими животными по аналогии.
// Также сделать метод разговор (Chat) - в зависимости от животного издать соответствующий звук. От него будет три дочерних класса Тигр(Tiger), Курица(Chicken), Обезьяна(Monkey).
//
//Создать зоопарк. Это массив из трех объектов данных животных. Предложить пользователю выбор покормить или поговорить с животным. После того как пользователь сделал выбор, предложить ему с каким животным поговорить/покормить.

class Animal {
    private String name;
    private String Animals;

    public Animal(){
    }
    public Animal(String name, String Animals){
        this.name = name;
        this.Animals = Animals;
    }

    public void Eat() {

    }
    public void Chat(){

    }
    public void getName() {
        System.out.println(this.name);
    }
}

class Leon extends Animal{
    public Leon(String name, String Animals) {
        super(name, Animals);
    }
//    public void getName() {
//        System.out.println(this.name + " " + this.Animals);
//    }

    @Override
    public void Eat(){
        System.out.println("Give me meat");
    }
    @Override
    public void Chat(){
        System.out.println("PPPPPPPPPP");}}

class Chicken extends Animal{
    public Chicken(String name, String Animals) {
        super(name, Animals);
    }
    @Override
    public void Eat(){
        System.out.println("Give me worms");
    }
    @Override
    public void Chat(){
        System.out.println("Chik");}}

class Monkey extends Animal{
    public Monkey(String name, String Animals) {
        super(name, Animals);
    }
    @Override
    public void Eat(){
        System.out.println("Give me banana");
    }
    @Override
    public void Chat(){
        System.out.println("YYYYYAAAAAA");}}


public class Lesson13 {
    public static void  main (String [] args){
        Leon le = new Leon("Leva", "Cats");
        Chicken ch = new Chicken("Kypa","Birds");
        Monkey mo = new Monkey("Chezar","Gorila");
        Scanner sc = new Scanner(System.in);
        Animal [] arr = {le, ch, mo};

        System.out.print("Вы в зоопарке к какому животному хотите зайти?(1. Лев , 2. Курица, 3. Обезьяна): ");
        int animal = sc.nextInt() - 1;
//        if (animal > 0 && animal <4)
//            arr[animal].getName();
//        else {
//            System.out.println("У нас пока только 3 животных");
//            return;
//        }

        System.out.print("Выберите что хотите сделать? (1. Поговорить, 2. Покормить): ");
        int deystvie = sc.nextInt();
        if (deystvie == 1)
            arr[animal].Chat();
        else
            arr[animal].Eat();

    }
}
