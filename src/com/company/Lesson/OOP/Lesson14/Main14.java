package com.company.Lesson.OOP.Lesson14;

public class Main14 {
    public static void main (String[] args){
        sedan14 sedan = new sedan14("Fokus", "Ford", true);
        Gryz gryzovik = new Gryz("New", "Kamaz",true);


        sedan.openDoor();
        sedan.inbag();
//        sedan.setBag();
        sedan.signalSi();

        gryzovik.openDoor();
        gryzovik.inpricep();
//        gryzovik.setPricep();8
        gryzovik.signalSi();
    }
}
