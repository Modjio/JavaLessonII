/*
Сортировка массива методом выбора
 */

import org.jetbrains.annotations.NotNull;

public class SelectionSort2 {
    public static int currentMin, currentMinIndex;

    public static void main(String[] args) {
        int[] list = {8, 1, 2, 4, 9, 3, 7, 0, 5, 6};    // задаём не сортированный массив

        runSort2(list);        // вызываем функцию сортировки

        // выводим сортированный массив
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void runSort2(int @NotNull [] list) {
        currentMin = list[0];       // Задаём первое число для сравнения первое число массива
        int a = 0;                  // задаём начало основного цикла

        do {
            for (int i = a + 1; i < list.length; i++) {     // находим минимальное значение и его индекс
                if (currentMin > list[i]) {
                    currentMin = list[i];                   // обновляем минимальное значение
                    currentMinIndex = i;                    // и его индекс
                }
            }

            // если минимальное значение уже на месте, то пропускаем
            if (currentMinIndex != a) {
                list[currentMinIndex] = list[a];
                list[a] = currentMin;
            }

            a++;                                // увеличиваем счётчик чикла

            currentMin = list[a];               // обновляем проверяемое значение
            currentMinIndex = a;                // и индекс
        } while (a < list.length - 1);          // выходим из цикла, если отсортировали предпоследнее значение
    }
}
