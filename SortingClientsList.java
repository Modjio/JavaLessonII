/*
Напишите программу, которая сортирует в порядке возрастания балансы счетов и выводит фамилии и инициалы клиентов,
исходя из введенных пользователем данных о клиентах (ФИО полностью и баланс счета).
 */

import java.util.Scanner;

public class SortingClientsList {
    public static void main(String[] args) {
        int tempBalance;    // переменная для временного хранения баланса при перестановке
        String[][] tempClientList = new String[1][3];      // массив для временного хранения ФИО при перестановке
        int row;    // создаём переменную числа строк массива

        Scanner input = new Scanner(System.in);

        // Запрашиваем количество строк массива
        System.out.print("Сколько будет человек? ");
        row = input.nextInt();
        input.nextLine(); // "съедаем" перевод каретки

        // Создаём массив [?][3] - для ФИО
        String[][] clientsList = new String[row][3];
        // Создаём массив [?] - для баланса
        int[] clientsBalance = new int[row];

        // Введите:     Фамилию - Имя - Отчество - Баланс
        System.out.println("\nВведите данные в формате Ф-И-О-Баланс через Enter\n");
        for (int i = 0; i < clientsList.length; i++) {
            System.out.print("Ведите данные клиента №");
            System.out.print(i + 1 + "\n");
            for (int j = 0; j < clientsList[i].length; j++) {
                clientsList[i][j] = input.nextLine();   // ФИО
            }
            clientsBalance[i] = input.nextInt();        // Баланс
            input.nextLine(); // "съедаем" перевод каретки
        }

        // Сортируем оба массива по увеличению баланса
        boolean sorted = false;     // задаём переменную для начала цикла
        while (!sorted) {           // пока результат true - повторяем цикл (!false = true или !true = false)
            sorted = true;          // если массив отсортирован то ставим true и выходим из цикла
            // итерируем по массиву до предпоследнего значения
            for (int i = 0; i < clientsBalance.length - 1; i++) {
                // сравниваем текущее значение со следующим
                if (clientsBalance[i] > clientsBalance[i + 1]) {
                    // и если оно больше, то массив не сортирован
                    sorted = false;     // массив не сортирован, не выходим

                    // поменять метами балансы в массиве Балансы
                    tempBalance = clientsBalance[i];
                    clientsBalance[i] = clientsBalance[i + 1];
                    clientsBalance[i + 1] = tempBalance;

                    // поменять местами ФИО в массиве Кленты соответственно
                    for (int j = 0; j < clientsList[i].length; j++) {
                        tempClientList[0][j] = clientsList[i][j];
                        clientsList[i][j] = clientsList[i + 1][j];
                        clientsList[i + 1][j] = tempClientList[0][j];
                    }
                }
            }
        }

        System.out.println();

        /* Вывод массива в формате Фамилия И.О. Баланс */
        for (int i = 0; i < clientsList.length; i++) {
            for (int j = 0; j < clientsList[i].length; j++) {
                System.out.print(clientsList[i][j] + " ");
                j++;
                System.out.print(clientsList[i][j].charAt(0) + ".");
                j++;
                System.out.print(clientsList[i][j].charAt(0) + ". ");
                j++;
                System.out.print(clientsBalance[i] + " руб.");
                System.out.println();
            }
        }
    }
}
