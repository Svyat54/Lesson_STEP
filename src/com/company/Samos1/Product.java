package com.company.Samos1;

public class Product {
    private String name;
    private double price;
    private int record;

    public Product(String name, int price, int record){
        this.name = name;
        setPrice(price);
        setRecord(record);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }



//    public void getInfoProduct(){
//        System.out.println(this.name + " " + this.price+ " " + this.record);
//    }

}
