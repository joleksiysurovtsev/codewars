package com.company.train45;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1 + s2 + s3) / 3;
        char rez = ' ';
        if (90 <= average && average <= 100) {
            rez = 'A';
        } else {
            if (80 <= average && average < 90) {
                rez = 'B';
            } else {
                if (70 <= average && average < 80) {
                    rez = 'C';
                } else {
                    if (60 <= average && average < 70) {
                        rez = 'D';
                    } else {
                        if (0 <= average && average < 60) {
                            rez = 'F';
                        }
                    }
                }
            }
        }

        return rez;
    }
}
