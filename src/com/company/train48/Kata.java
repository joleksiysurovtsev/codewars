package com.company.train48;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return ((IntStream.of(classPoints).sum())/classPoints.length<=yourPoints);
    }
}
