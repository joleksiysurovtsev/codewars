package com.company.train36;

import java.util.Arrays;

public class StringUtils {

    public static String toAlternativeString(String string) {
        char[] arrStForChanges = string.toCharArray();
        int[] arrtoInt = new int[arrStForChanges.length];


        for (int i = 0; i < arrStForChanges.length; i++) {
            arrtoInt[i] = arrStForChanges[i];
        }


        for (int i = 0; i < arrStForChanges.length; i++) {
            if (arrtoInt[i] >= 65 && arrtoInt[i] <= 90) {
                arrtoInt[i] += 32;

            } else {
                if (arrtoInt[i] >= 97 && arrtoInt[i] <= 122) {
                    arrtoInt[i] -= 32;
                }
            }
        }

        char[] characters = new char[arrtoInt.length];

        for (int i = 0; i < arrtoInt.length; i++) {
           characters[i]  =  (char) arrtoInt[i];
            System.out.println(characters[i]);
        }


        String sx = new String(characters);


        return  sx;


    }
}