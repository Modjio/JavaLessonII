/*
Счёт Фибоначчи, через рекурсию

Числа Фибоначчи	    0	1	1	2	3	5	8	13	21	34	55	89	...	...	...
    Индексы	        0	1	2	3	4	5	6	7	8	9	10	11	...	...	...

 */

import java.util.Scanner;

public class RecursiveComputeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получить индекс числа Фибоначчи
        System.out.print("Введите индекс числа Фибоначчи: ");
        int index = input.nextInt();

        // Найти и отобразить число Фибоначчи
        System.out.println("Число Фибоначчи с индексом " + index + " равно " + fibonacci(index));
    }

    public static long fibonacci(long index) {
        if (index == 0) // простой случай
            return 0;
        else if (index == 1) // простой случай
            return 1;
        else  // упрощение и рекурсивные вызовы
            return fibonacci(index - 1) + fibonacci(index - 2);
    }
}
