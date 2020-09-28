package com.company.train43;

public class Kata {

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";

        for (int i = 0; i < one.length(); i++) {
            char c1 = one.charAt(i);
            char c2 = two.charAt(i);
            char c3 = three.charAt(i);
            result += String.valueOf(c1) + String.valueOf(c2) + String.valueOf(c3);
        }
        return result;
    }
}

//    StringBuilder sb = new StringBuilder(s1.length()*3);
//        for (int i=0; i<s1.length(); i++) {
//        sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
//        }
//        return sb.toString();