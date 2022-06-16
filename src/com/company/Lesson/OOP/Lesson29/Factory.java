package com.company.Lesson.OOP.Lesson29;

public class Factory {
    public Pasta production(PastaType pastaType) {
        switch (pastaType){
            case Spaghetti:
                return new Spaghetti();
            case FarFalle:
                return new FarFalle();
            case Fettuccine:
                return new Fettuccine();
            default:
                return null;
        }
    }
}
