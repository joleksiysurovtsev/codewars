package com.company.train44;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        double totalBlues = blueStart - bluePulled;
        double totalReds = redStart - redPulled;
        double probability = totalBlues / (totalBlues+totalReds);

        return probability;
    }
}
