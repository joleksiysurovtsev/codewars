package com.company.train55;
public class Sequence{

    public static int[] reverse(int n){
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= arr.length-i;
        }
        return arr;
    }

}