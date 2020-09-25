package com.company.train10;

import java.util.Arrays;

public class GrassHopper {

    public static int summation(int n) {
        if (n == 1) {
            return n;
        }
        int x =0;
        for (int i = 1; i <n+1 ; i++) {
            x +=i;
        }
        return x;
    }
}