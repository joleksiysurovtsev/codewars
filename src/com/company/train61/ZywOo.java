package com.company.train61;

import java.util.Arrays;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (arr.length <= n){return Arrays.copyOfRange(arr,0,arr.length);}
        return Arrays.copyOfRange(arr,0,n);
    }
}