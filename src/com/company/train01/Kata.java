package com.company.train01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        char[] result = s.toCharArray();

        int[] res2 = new int[result.length];

        for (int i = 0; i < result.length; i++) {
            Character x = result[i];
            String f = x.toString();
            int z = Integer.parseInt(f);
            res2[i] = z;
        }

        return res2;
    }
    // Code here
}
