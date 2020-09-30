package com.company.train66;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Kata {

    public static String well(String[] x) {
        Collections.frequency(Arrays.asList(x), "good");
        int count = 0;
        for (String z : x
        ) {
            if (z.equalsIgnoreCase("good")) {
                count++;
            }
        }
        if (count == 1 || count == 2) {
            return "Publish!";
        }
        if (count > 2) {
            return "I smell a series!";
        } else return "Fail!";
    }

}