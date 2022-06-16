package com.company.Lesson.OOP.Lesson28;

import java.util.Comparator;

public class CompaireD implements Comparator<TV> {
    public int compare(TV a, TV b) {
        if (a.getDiag() < b.getDiag()) {
            return 1;
        } else {
            if (a.getDiag() > b.getDiag()) {
                return -1;
            } else
                return 0;
        }
    }
}
