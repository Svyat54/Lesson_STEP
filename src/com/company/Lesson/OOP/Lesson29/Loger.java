package com.company.Lesson.OOP.Lesson29;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class Loger {
    private static Loger logScreen;
    boolean onScreen;
    String pathl;

    public Loger(boolean onScreen) throws IOException {
        this.onScreen = onScreen;
        this.pathl = "log.txt";
        if (!onScreen){
            new FileWriter(pathl, false);
        }
    }

    public void logInfo(){

    }

    public void writeFileLog(String str) throws IOException{
        Files.writeString(Paths.get(pathl),str + "\n", StandardOpenOption.APPEND);
    }

    public void logWriteFile(String str, String path) throws IOException {
        Date date = new Date();
        String logStr = date + " started method writeFile: string - " + str + " writes to file - " + path;
        if (this.onScreen){
            System.out.println(logStr);
        }else {
            writeFileLog(logStr);
        }
    }

    public void logGetIntOffFile(String strF, String path) throws IOException {
        Date date = new Date();
        String logStr = date + " started method getIntOfFile: string - " + strF + " read from a file - " + path;
        if (this.onScreen){
            System.out.println(logStr);
        }else {
            writeFileLog(logStr);
        }
    }

    public void logPrint() throws IOException{
        Date date = new Date();
        String logStr = date + " started method print: displays entered numbers on the screen" ;
        if (this.onScreen){
            System.out.println(logStr);
        }else {
            writeFileLog(logStr);
        }
    }

    public void logMax(String path) throws IOException{
        Date date = new Date();
        String logStr = date + " started method Max: find max";
        if (this.onScreen){
            System.out.println(logStr);
        }else {
            writeFileLog(logStr);
        }
    }

    public void logMin(String path) throws IOException{
        Date date = new Date();
        String logStr = date + " started method Min: find min" ;
        if (this.onScreen){
            System.out.println(logStr);
        }else {
            writeFileLog(logStr);
        }
    }

    public void logPrintMaxMin(String path) throws IOException{
        Date date = new Date();
        String logStr = date + " started method printMaxMin: read from a file " + path ;
        if (this.onScreen){
            System.out.println(logStr);
        }else {
            writeFileLog(logStr);
        }
    }

    public static synchronized Loger getLoger(boolean onScreen) throws IOException {
        if (logScreen == null){
            logScreen = new Loger(onScreen);
        }
        return logScreen;
    }
}
