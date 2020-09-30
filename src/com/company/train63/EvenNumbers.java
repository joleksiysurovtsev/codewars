package com.company.train63;

import java.util.stream.IntStream;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return IntStream.of(numbers).filter(num -> num % divider == 0).toArray();
    }
}
