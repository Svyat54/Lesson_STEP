package com.company.Books.Step1;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public Employee(String name, double salary, int year, int month, int day){
            this.name = name;
            this.salary = salary;
            hireDay = LocalDate.of(year, month, day);
        }

        public void raiseSalary(double byPercent){
            double raise = salary * byPercent / 100;
            salary += raise;
        }
    }

