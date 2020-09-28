package com.company.train33;
public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i]+arr2[i];
        }
        return sum1;
    }

    //IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
}