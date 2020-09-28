package com.company.train27;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(subtractSum(10));
    }

    public static String subtractSum(int n) {
        String result = "";
        while (true) {
            Integer f = n;
            char[] s = f.toString().toCharArray();
            Integer sum = 0;
            for (char c : s) {
                sum += Character.getNumericValue(c);
            }

            n -= sum;
            if (n < 101) {
                String[] arr = new String[]{"", "kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon",
                        "pineapple", "apple", "pineapple", "cucumber", "pineapple", "cucumber", "orange", "grape", "orange",
                        "grape", "apple", "grape", "cherry", "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple",
                        "melon", "banana", "melon", "pineapple", "melon", "pineapple", "cucumber", "orange", "apple", "orange",
                        "grape", "orange", "grape", "cherry", "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana",
                        "kiwi", "banana", "melon", "pineapple", "melon", "apple", "cucumber", "pineapple", "cucumber",
                        "orange", "cucumber", "orange", "grape", "cherry", "apple", "cherry", "pear", "cherry", "pear",
                        "kiwi", "pear", "kiwi", "banana", "apple", "banana", "melon", "pineapple", "melon", "pineapple",
                        "cucumber", "pineapple", "cucumber", "apple", "grape", "orange", "grape", "cherry", "grape",
                        "cherry", "pear", "cherry", "apple", "kiwi", "banana", "kiwi", "banana", "melon", "banana",
                        "melon", "pineapple", "apple", "pineapple"};
                result = arr[n];
                break;
            }
        }
        return result;
    }
}
