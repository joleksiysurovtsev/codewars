package com.company.train37;

public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        if (str.isEmpty()) {
            return 0;
        } else {
            for (char x : str.toCharArray()
            ) {
                if (x == letter) {
                    count++;
                }
            }
        }
        return count;
    }
}

//    return (int)str.chars().filter(x -> x == letter).count();