package com.company.train14;

public class Kata {
    public static int nthPower(int[] array, int n) {
        if (array.length <= n) {
            return -1;
        } else
            return (int) Math.pow(array[n], n);
    }
}