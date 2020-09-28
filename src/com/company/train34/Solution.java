package com.company.train34;

public class Solution {

    public static boolean check(Object[] a, Object x) {
        boolean flag = false;
        for (Object s : a ) {
            if (s.equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
 //return Arrays.asList(a).contains(x);
}