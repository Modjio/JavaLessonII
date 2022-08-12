public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {8, 1, 2, 4, 9, 3, 7, 0, 5, 6};    // задаём не сортированный массив

        runSort(list);      // вызываем функцию сортировки

        for (int i:         // выводим сортированный массив
             list) {
            System.out.print(list[i] + " ");
        }
    }

    public static void runSort(int[] list) {
        int temp;       // создаём переменную темп

        for (int i = 0; i < list.length; i++) {     // сравниваем первое значение с остальными, после +1
            for (int j = i + 1; j < list.length; j++) {     // пошагово сравниваем весь массив с первым значением
                if (list[i] < list[j]) {    // если первое значение меньше, то меняем местами
                    temp = list[i];         // используя переменную темп
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
