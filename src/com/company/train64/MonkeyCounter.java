package com.company.train64;

import java.util.Arrays;

public class MonkeyCounter
{
    public static int[] monkeyCount(final int n){
        int[] arr = new int[n];
        Arrays.setAll(arr, i -> i + 1);
        return arr;
    }

}