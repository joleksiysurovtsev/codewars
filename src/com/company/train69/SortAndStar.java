package com.company.train69;

import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));

    }
}