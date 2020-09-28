package com.company.train39;

public class Kata {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return (distanceToPump <= (mpg * fuelLeft));
    }
}
