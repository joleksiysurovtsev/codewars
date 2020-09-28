package com.company.train24;

public class Main {
    public static void main(String[] args) {
        System.out.println(fakeBin("7548445"));
    }

    public static String fakeBin(String numberString) {
        for (int i = 0; i < numberString.length(); i++) {
            char z = numberString.charAt(i);
            int x = Character.getNumericValue(z);
            if (x >= 5) {
                StringBuilder myName = new StringBuilder(numberString);
                myName.setCharAt(i, '1');
                numberString = myName.toString();
            } else {
                StringBuilder myName = new StringBuilder(numberString);
                myName.setCharAt(i, '0');
                numberString = myName.toString();
            }
        }
        return numberString;
     //  return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
