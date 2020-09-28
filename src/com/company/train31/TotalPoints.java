package com.company.train31;

public class TotalPoints {

    public static int points(String[] games) {
        int point = 0;
        for (int i = 0; i < games.length; i++) {
            String x = games[i];
            int f = x.charAt(0);
            int s = x.charAt(2);
            if (f > s) {
                point += 3;
            } else {
                if (f < s) {
                    point += 0;
                } else {
                    if (f == s) {
                        point += 1;
                    }
                }
            }
        }
        return point;
    }
}