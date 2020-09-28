package com.company.train16;
public class Cockroach{
    public int cockroachSpeed(double x){
        int secondsInHour = 3600;
        int cmInKm = 100000;
        int centimetresPerSecond = (int) (x * cmInKm / secondsInHour);
        return centimetresPerSecond;
    }
}