package com.company.train32;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        int indexSpase = name.indexOf(" ");
        String f = name.substring(0,indexSpase);
        String s = name.substring(indexSpase+1);
        String rez = f.charAt(0)+"."+s.charAt(0);
        return rez.toUpperCase();
    }
}