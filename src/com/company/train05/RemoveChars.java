package com.company.train05;

public class RemoveChars {
    public static String remove(String str) {
        return new StringBuffer(str).deleteCharAt(str.length() - 1).deleteCharAt(0).toString();
    }
}