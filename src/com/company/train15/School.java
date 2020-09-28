package com.company.train15;

import java.util.stream.IntStream;

public class School{

    public static int getAverage(int[] marks){
        return Math.round(IntStream.of(marks).sum()/marks.length);
    }

}