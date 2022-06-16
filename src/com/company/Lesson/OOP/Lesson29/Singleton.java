package com.company.Lesson.OOP.Lesson29;

public class Singleton {
    private static Singleton connection;
    private String ip;

//    public Singleton() {
//        this.ip = null;
//    }
    public String getIp() {
        return connection.ip;
    }

    public void setIp(String ip) {
        connection.ip = ip;
    }

    public void openCon() {
        System.out.println("Open");
    }

    public void closeCon(){
        System.out.println("Close");
    }

    private Singleton(String ip ){
        this.ip = ip;
    }

    public static synchronized Singleton getConnection(){
        if(connection == null){
            connection = new Singleton(null);
        }
        return connection;
    }

    public static synchronized Singleton getConnection(String ip){
        if(connection == null){
            connection = new Singleton(ip);
        }
        return connection;
    }
}
