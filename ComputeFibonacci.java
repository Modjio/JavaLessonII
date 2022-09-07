/*
Счёт Фибоначчи, без рекурсии

Числа Фибоначчи	    0	1	1	2	3	5	8	13	21	34	55	89	...	...	...
    Индексы	        0	1	2	3	4	5	6	7	8	9	10	11	...	...	...

 */

import java.util.Scanner;

public class ComputeFibonacci {
    public static void main(String[] args) {
        int index;  // Индекс числа Фибоначчи

        Scanner input = new Scanner(System.in);

        // Получить индекс числа Фибоначчи
        System.out.print("Введите индекс числа Фибоначчи (подсказка: это положительное целое число): ");
        index = input.nextInt();

        // Вызов метода Фибоначчи
        fibonacci(index);
    }

    public static void fibonacci(int index) {
        int f2 = 0;     // Число n-2
        int f1 = 1;     // Число n-1
        int currentFib = 1;

        if (index < 1)
            // Ввели 0 и меньше, завершить программу
            System.out.println("Вы ввели " + index + ". Как мне работать с этим числом?");
        else {
            // Расчёт числа
            for (int i = 1; i < index; i++) {
                currentFib = f2 + f1;   // счёт Фиббоначи это сумма двух предыдущих чисел
                f2 = f1;            // сдвигаем первое число
                f1 = currentFib;    // сдвигаем второе число
            }

            // Вывод числа Фибоначчи
            System.out.println("Число Фибоначчи с индексом " + index + " равно " + currentFib);
        }
    }
}
