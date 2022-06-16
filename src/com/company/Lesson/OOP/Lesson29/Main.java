package com.company.Lesson.OOP.Lesson29;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Singleton si = Singleton.getConnection("27.1.0.0");
//        System.out.println(si.getIp());
//
//        si = Singleton.getConnection("28.0.1.1");
//        System.out.println(si.getIp());

//        Factory fac = new Factory();
//        System.out.println(fac.production(PastaType.FarFale));

        //Task3
        int log = 1;
        String strLine = "15 16 99 100 54";
        String path = "testTest3.txt";
        Task.writeFile(strLine, path, log);

        int[] arr = Task.getIntOfFile(path, log);
        Task.print(arr,log);

        Task.Max(arr, path, log);
        Task.Min(arr, path, log);
        Task.printMaxMin(path, log);

    }
}