package com.company.train07;

public class BestSolution {
    public static String repeatStr(final int repeat, final String string) {

        return String.valueOf(string).repeat(Math.max(0, repeat));
    }
}
