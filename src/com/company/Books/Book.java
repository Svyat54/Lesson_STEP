package com.company.Books;

public class Book {
    public static void main(String[] args) {
        //заполнить массив staff тремя объектами
         // типа Employee
       Employee2[] staff = new Employee2[3];
        staff[0] = new Employee2("Tom", 40000);
        staff[1] = new Employee2("Dick", 60000);
        staff[2] = new Employee2("Harry", 65000);
       //вывести данные обо всех объектах типа Employee
        for (Employee2 e : staff)
        {
              e.setId();
         System.out.println("name=" + e.getName() + ",id="
                 + e.getId() + ",salary=" + e.getSalary());
    }
        int n = Employee2.getNextid(); //вызвать статический метод
        System.out.println("Next available id=" + n);
    }
}

class Employee2 {
    private static int nextid;
    private String name;
    private double salary;
    private int id;

    public Employee2(String n, double s){
        name = n;
        salary = s;
        id = 0;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public  int getId(){
        return id;
    }
    public void setId(){
        id = nextid; //установить следующий доступный идентификатор
        nextid++;
    }
    public static int getNextid(){
        return nextid;
    }
    public static void main(String[] args){  //выполнить модульный тест
        var e = new Employee2("Harry", 50000);
        System.out.println(e.getName() +" "+ e.getSalary() );
    }
}
