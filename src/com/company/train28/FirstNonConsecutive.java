package com.company.train28;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
        Integer sought = null;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != (array[i] + 1)){
                 sought = array[i + 1];
                break;
            }
        }
        return sought;
    }
}
