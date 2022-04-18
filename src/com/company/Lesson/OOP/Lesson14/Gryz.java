package com.company.Lesson.OOP.Lesson14;

import com.company.Lesson.OOP.Car;

public class Gryz extends Car {

    private boolean pricep;

    public Gryz(String model, String brand, boolean pricep){
        super(model, brand);
        this.pricep = pricep;
    }


    public boolean inpricep(){
        return pricep;
    }

    public void setPricep(boolean pricep){
        this.pricep = pricep;
    }

    @Override
    public void openDoor() {
        System.out.println("Со скрипом");
    }

    @Override
    public void signalSi() {
        System.out.println("да кому она нужна");
    }
}

