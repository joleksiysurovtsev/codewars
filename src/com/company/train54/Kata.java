package com.company.train54;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int squareSum(int[] n) {
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) Math.pow(n[i], 2);
        }
        return IntStream.of(n).sum();
    }
}