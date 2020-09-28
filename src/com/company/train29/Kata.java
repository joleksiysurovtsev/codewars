package com.company.train29;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Kata {
    public static int expressionsMatter(int a, int b, int c) {
        ArrayList<Integer> integers = new ArrayList<>();
        int[] mas = new int[10];

        mas[0] = a * (b + c);
        mas[1] = a * b * c;
        mas[2] = a + b * c;
        mas[3] = a * b + c;
        mas[4] = a + b + c;

        mas[5] = (a * b) * c;
        mas[6] = a * (b * c);

        mas[7] = (a + b) * c;
        mas[8] = a + (b * c);

        mas[9] = (a * b) + c;


        Arrays.sort(mas);
        return mas[9];

    }
}