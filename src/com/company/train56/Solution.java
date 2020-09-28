package com.company.train56;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static int century(int number) {
        int rez = 0;
        if (number <= 100) {
            rez = 1;
        } else {
            if (number % 100 == 0) {
                rez = number / 100;
            } else {
                if (number % 100 != 0) {
                    rez = (number / 100) + 1;
                }
            }
        }
        return rez;
    }
}
