package com.company.Lesson.OOP.Lesson28;

import java.util.Comparator;

public class Compaire implements Comparator<TV> {
    public int compare(TV a, TV b) {
        if (a.getPrice() < b.getPrice()) {
            return 1;
        } else {
            if (a.getPrice() > b.getPrice()) {
                return -1;
            } else
                return 0;
        }
    }
}

