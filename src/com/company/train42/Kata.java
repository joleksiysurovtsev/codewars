package com.company.train42;

public class Kata {
    public static boolean divide(int weight) {
        boolean flag = false;
        for (int i = 0; i < weight; i++) {
            int x = weight - i;
            int y = i;
            if (x % 2 == 0 && y % 2 == 0) {
                flag = true;
                break;
            }
        }
        if (weight==2){
            flag = false;
        }
        return flag;
    }
}