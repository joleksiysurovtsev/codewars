package com.company.train62;

import java.util.stream.IntStream;

public class Maps {
    public static int[] map(int[] arr) {
      return   IntStream.of(arr).map(w -> w*2 ).toArray();
    }
}