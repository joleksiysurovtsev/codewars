package com.company.train07;

public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder s= new StringBuilder();

        if (repeat>0) {
             s = new StringBuilder(string);
            for (int i = 0; i < repeat - 1; i++) s.append(string);
        }
        return s.toString();
    }
}
