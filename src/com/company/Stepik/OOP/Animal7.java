package com.company.Stepik.OOP;

public class Animal7 {
//    public String type, name, rename;
//    public double weight, age, holiday = 0.1;
//    public boolean isSwim, isWalk, isFly;
    public void getInfo(){
        System.out.println(this.type + " " + this.name + " " + this.rename + " " + this.weight + " " + this.age + " " + this.holiday + " " + this.isSwim + " " + this.isWalk + " " + this.isFly);
    }

    //Task3
private String type, name, rename;

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    private double weight, age, holiday = 0.1;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHoliday() {
        return holiday;
    }

    public void setHoliday(double holiday) {
        this.holiday = holiday;
    }

    private boolean isSwim;
    private boolean isWalk;
    private boolean isFly;

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    //Task1
    public void rename(String rename) {
        this.name = rename;
    }

    public void holiday(double i) {
        this.weight = weight + (holiday * i);
    }
//
    public Animal7(){
        this.type = type;
        this.name = name;
        this.rename = rename;
        this.age = age;
        this.weight = weight;
        this.holiday = holiday;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    //Task2
    public Animal7 (String type, String name){
        this.type = type;
        this.name = name;
    }
//
    public Animal7 (String type, double age){
        this.type = type;
        this.name = "No Name";
        this.age = age;
    }
//
    public Animal7 (String type, String name,double age, double weight, boolean isSwim, boolean isWalk, boolean isFly ){
        this.type = type;
        this.name = name;
        this.rename = rename;
        this.age = age;
        this.weight = weight;
        this.holiday = holiday;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    //Task3

}

