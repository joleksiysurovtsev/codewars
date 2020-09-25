package com.company.train13;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count =0;
        for (boolean a : arrayOfSheeps) {
            if (a) {
                count++;
            }
        }
        return count ;
    }
}