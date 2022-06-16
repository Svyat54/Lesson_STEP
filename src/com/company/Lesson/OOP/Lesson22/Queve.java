package com.company.Lesson.OOP.Lesson22;
//Queve -
public class Queve {
    private int[] arr;
    private int size;
    private int lastIndex;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public Queve(int size) {
        this.size = size;
        this.arr = new int[size];
        this.lastIndex = -1;
    }

    public void push(int value) throws IndexOutOfBoundsException {
        this.lastIndex++;
        if (this.lastIndex == -1){
            this.arr[0] = value;
        }
        else {
            if (lastIndex >= arr.length) {
                throw new IndexOutOfBoundsException();
            } else {
                for (int i = this.lastIndex; i > 0; i--) {
                    this.arr[i] = this.arr[i - 1];
                }
                this.arr[0] = value;
            }
        }
    }

    public int pop(){
        int tmpArr = this.arr[this.lastIndex];
        this.arr[this.lastIndex] = 0;
        this.lastIndex--;
        return tmpArr;
    }

    //возвращает последний элемент без удаления
    public boolean isEmpty(){
        return this.lastIndex == -1;
    }

    //возвращает True/False если стек пустой или нет
    public int peek() {
        return this.arr[this.lastIndex];
    }

    //проверяет наличие элемента в стеке
    public int search (int value) {
        for(int i = 0; i < this.arr.length; i++){
            if (this.arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < this.lastIndex + 1; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}
