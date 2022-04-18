package com.company.Lesson;


public class Lesson11 {

    static void user (String name, String lastname){
        System.out.print("name " + name + "|| LastName " + lastname);
    }

    static void user (String name, String lastname , String city){
        user(name, lastname);
        System.out.print("|| city " + city);
    }

    static void user (String name, String lastname , String city, int age){
        user(name, lastname, city);
        System.out.println("|| age " + age);
    }

    public static void  main (String [] args){
        user("Toly" , "Koly", "Syberia", 21);
    }
}
