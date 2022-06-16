package com.company.Lesson.OOP.Lesson28;

import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;



//Лямбда выражение
public class Main {
    static int getOne(int [] arr){
        if (arr.length > 1)
        return arr[1];
        else
            return 0;
    }
    public static void main(String[] args) {
//        IGetInt gI = () -> 1;
//        System.out.println(gI.getter());
//        IGetInt gI = (arr) -> arr[3];
//        System.out.println(gI.getter(new int[] {1, 2 , 3 , 4}));
//        List<Integer> list = new ArrayList<>();
//        list.add(1000);
//        list.add(500);
//        list.add(400);
//        list.add(500);
//        list.add(1000);
//        list = list.stream()
//                .filter(l -> l.equals(1000))
//                .collect(Collectors.toList());
//        list.stream()
//                .forEach(l -> System.out.println(l));

        //Task1
//        LinkedList <Integer> list = new LinkedList<>();
//        for (int i = 0; i < 20; i++){
//            list.add((int)(Math.random() * 20));
//        }
//        list.stream()
//                .forEach(l -> System.out.print(l + " "));
//        System.out.println("\n" + list.stream()
//                .filter(l -> l % 2 == 0)
//                .count() + " Чётных");
//
//        System.out.println("\n" + list.stream()
//                .filter(l -> l % 2 != 0)
//                .count() + " Не чётных");
//
//        System.out.println("\n" + list.stream()
//                .filter(l -> l == 0)
//                .count() + " Равен 0");

        //Task2
//        String [] city = {"MSK", "NSK", "SPB", "KEM", "MSK", "NSK", "SPB", "KEM", "TOMSK", "OMSkk", "TOMSK", "OMSkk"};
//        LinkedList <String> list = new LinkedList<>();
//        char ch = 'n';
//        for (int i = 0; i < 20; i++){
//            list.add(city[(int)(Math.random() *(city.length - 1))]);
//        }
//        list.stream()
//                .forEach(l -> System.out.print(l + " ")); // все города
//                .forEach(l -> {  //вывод городов с длиной больше 4 символов
//                    if (l.length() > 4)
//                        System.out.println(l);
//                });
//                .forEach(l -> {
//                    if (ch == Character.toLowerCase(l.charAt(0))){
//                        System.out.println(l);
//                    }
//                });

        //Task4
        LinkedList <TV> list = new LinkedList<>();
        list.add(new TV("Samsung", 2019, 50000, 52, "Китай"));
        list.add(new TV("Sony", 2020, 55000, 55, "Китай"));
        list.add(new TV("Nokia", 2020, 40000, 450, "Китай"));
        list.add(new TV("LG", 2019, 45000, 44, "Китай"));
        list.add(new TV("Toshiba", 2021, 50000, 552, "Китай"));

//        list.stream()
//                .forEach(t -> System.out.println(t.model + " |" + t.date + " |" + t.price + " |" + t.diag + " |" + t.made)); // все ТВ

//                .forEach(t -> {
//                    if (t.diag > 100){
//                        System.out.println(t.model + " " + t.price + " " + t.diag);
//                    }
//                    else{
//                        System.out.println("Такой диагонали нет в наличии :(");
//                    }
//                }); //Заданная Диагональ

//                .forEach(t -> {
//                    if (t.made.equals("Китай")) {
//                        System.out.println(t.model + " " + t.price + " " + t.made);
//                    }
//                    else{
//                        System.out.println("Таких производителей нет в наличии :(");
//                    }
//                }); // Один производ

//                .forEach(t -> {
//                    if (t.date == 2022){
//                        System.out.println(t.model + " " + t.price + " " + t.date);
//                    }
//                    else{
//                        System.out.println("Такой даты производства нет в наличии :(");
//                    }
//                }); // по дате

//                .forEach(t -> {
//                    if (t.price > 50000){
//                        System.out.println(t.model + " " + t.price);
//                    }
//                    else {
//                        System.out.println("Укажите цену дешевле");
//                    }
//                }); // по цене дороже

//                .sorted(new Compaire())
//                .forEach(t -> System.out.println(t.model + " " + t.date + " " + t.price)); // сорт по цене

//                .sorted(new CompaireD())-
//                .forEach(t -> System.out.println(t.model + " " + t.date + " " + t.price + " " +t.diag)); // сорт по диаг


    }
}
