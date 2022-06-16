package com.company.Lesson.OOP.Lesson29;

import com.company.Samos1.Array;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

//Пользователь вводит с клавиатуры набор чисел и путь
//к файлу для сохранения полученных данных. Необходимо
//■ Сохранить все полученные числа; +
//■ Найти максимум, минимум. Эти значения сохранить в том же файле; +
//■ Отобразить числа; +
//■ Отобразить максимум и минимум; +
//■ Создать класс для логгирования операций. При создaнии объекта класса нужно уточнить куда производится
//логгирование: экран или файл. В программе можно создать только один объект класса. Все действия
//в программе необходимо логгировать с помощью объекта этого класса.
//Практические задания
public class Task {

    public static void writeFile(String str, String path, int log) throws IOException {
        boolean onScreen = true;
        FileWriter fwr = new FileWriter(path, false);
        fwr.write(str);
        fwr.close();
        if (log == 0) {
            onScreen = false;
        }
        Loger loger = Loger.getLoger(onScreen);
        loger.logWriteFile(str, path);
    }

    public static int[] getIntOfFile(String path, int log) throws IOException {
        boolean onScreen = true;
        BufferedReader br = new BufferedReader(new FileReader(path));
        String strF = br.readLine();
        String [] str = strF.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        if (log == 0) {
            onScreen = false;
        }
        Loger loger = Loger.getLoger(onScreen);
        loger.logGetIntOffFile(strF, path);
        return arr;
    }

    public static void print(int [] arr, int log) throws IOException {
        System.out.println(Arrays.toString(arr));
        boolean onScreen = true;
        if (log == 0) {
            onScreen = false;
        }
        Loger loger = Loger.getLoger(onScreen);
        loger.logPrint();
    }

    public static int Max(int[] arr, String path, int log) throws IOException {
        int max = arr[0];
        boolean onScreen = true;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        Files.writeString(Paths.get(path),"\n" + "max " + max, StandardOpenOption.APPEND);
        if (log == 0) {
            onScreen = false;
        }
        Loger loger = Loger.getLoger(onScreen);
        loger.logMax(path);
        return max;
    }

    public static int Min(int[] arr, String path, int log) throws IOException {
        int min = arr[0];
        boolean onScreen = true;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        Files.writeString(Paths.get(path), "\n" + "min " + min, StandardOpenOption.APPEND);
        if (log == 0) {
            onScreen = false;
        }
        Loger loger = Loger.getLoger(onScreen);
        loger.logMin(path);
        return min;
    }

    public static void printMaxMin(String path, int log)throws IOException {
        boolean onScreen = true;
        BufferedReader br = new BufferedReader(new FileReader(path));
        String strF;
        String [] arr = new String[2];
        while (true){
            if ((strF = br.readLine()) == null){
                break;
            }
            if (strF.split(" ")[0].equals("max")){
                System.out.println("Max " + strF.split(" ")[1]);
            }
            if (strF.split(" ")[0].equals("min")){
                System.out.println("Min "+ strF.split(" ")[1]);
            }
        }
        if (log == 0) {
            onScreen = false;
        }
        Loger loger = Loger.getLoger(onScreen);
        loger.logPrintMaxMin(path);
    }
}
