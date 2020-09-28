package com.company.train53;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MixedSum {
    public static void main(String[] args) {
        int sum = MixedSum.sum(Arrays.asList(5, "5"));
        System.out.println(sum);
    }

    /*
     * Assume input will be only of Integer o String type
     */
    public static int sum(List<?> mixed) {
        Integer sum = 0;
        for (int i = 0; i < mixed.size(); i++) {
            Object s = mixed.get(i);
            String l = s.toString();
            sum += Integer.parseInt(l);
        }
        return sum;
    }
}