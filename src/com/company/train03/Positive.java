package com.company.train03;

public class Positive {

    public static int sum(int[] arr) {
        int x = 0;
        for (int z : arr) {
            if (z > 0){
                x += z;
            }
        }
        return x;
    }
}