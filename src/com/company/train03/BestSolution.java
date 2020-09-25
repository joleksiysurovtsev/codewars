package com.company.train03;

import java.util.Arrays;

public class BestSolution {
    public static int sum(int[] arr){
        //решение с помощью лямбды
        //создаём поток из масива фильтруем передавая v если v больше нуля и сумируя всё
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }
}
