package com.company.train01;

public class BestSolution {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n)        // создали StringBuilder закинули в него число преобразовав в строку
                .reverse()                          // перевернули строку
                .chars()                            // преобразовали в символы так как стрингбилдер парсит их кодом ASSCI
                .map(Character::getNumericValue)    // Возвращает поток, состоящий из результатов применения данной
                                                    // функции к элементам этого потока. Это промежуточное соединение операции .
                .toArray();                         // Приводим этот поток к масиву
    }
}
