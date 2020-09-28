package com.company.train30;
public class Clock
{
    public static int Past(int h, int m, int s)
    {
        m += (h*60);
        s += (m*60);
        int milisec = s*1000;
        return milisec;
    }
}