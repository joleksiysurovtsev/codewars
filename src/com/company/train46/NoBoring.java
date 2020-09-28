package com.company.train46;

public class NoBoring {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(960000));
    }

    public static int noBoringZeros(int n) {
        String s = String.valueOf(n);
        if (s.length()==1){return 0;}else {
            for (int i = 0; i < s.length() + 1; i++) {
                if (s.charAt(s.length() - 1) == '0') {
                    String x = s.substring(0, s.length() - 1);
                    s = x;
                }
            }
        }

        int i = Integer.parseInt(s);
        return i;
    }
}
