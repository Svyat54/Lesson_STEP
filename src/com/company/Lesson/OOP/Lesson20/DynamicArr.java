package com.company.Lesson.OOP.Lesson20;

import java.util.Arrays;

public class DynamicArr {
    private  int[] arr;
    private int lenght;

    public DynamicArr(int[] arr) {
        this.arr = arr;
        this.lenght = arr.length;
    }
    public void push(int numb){
        int [] arr1 = new int [lenght + 1];
        for (int i =0; i < this.lenght; i++){
            arr1[i] = arr[i];
        }
        arr1[lenght] = numb;
        this.arr = arr1;
        this.lenght++;
    }

    public void printArr(){
        System.out.println(Arrays.toString(this.arr));
    }
}
