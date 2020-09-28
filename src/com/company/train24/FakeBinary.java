package com.company.train24;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char[] x = numberString.toCharArray();
        for (int i = 0; i < x.length ; i++) {
            if (x[i]<5){
                x[i] = 0;
            }else {
                x[i] = 1;
            }
        }

        return x.toString();
    }
}