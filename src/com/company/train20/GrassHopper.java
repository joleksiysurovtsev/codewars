package com.company.train20;
public class GrassHopper {

    public static String weatherInfo(int temp) {
        //        double c = convertToCelsius(temp);
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        //(32 °F − 32) × 5/9 = 0 °C
        double celsius = (temperature-32)*5/9;
        return celsius;
    }
}

//    public static String weatherInfo(double temp) {

//        if (c <= 0)
//            return (c + " is freezing temperature");
//        else
//            return (c + " is above freezing temperature");
//    }
//
//    public static double convertToCelsius(double temperature) {
//        double celsius = (temperature - 32) * 5/9;
//        return celsius;
//    }
//}