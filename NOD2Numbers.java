/*
Напишите программу, которая вычисляет и отображает наибольший общий делитель (далее — НОД) двух чисел.
 */

// дописать условие, если делитель не найден - останавливать цикл

import java.util.Scanner;

public class NOD2Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // получить 2 числа от пользователя
        System.out.print("Введите два числа через пробел: ");
        nod(input.nextInt(), input.nextInt()); // и передать их в метод
    }

    public static void nod(int n1, int n2) {
        int d = 2; // делитель равен от 2, т.к. 1 делится на всё без остатка
        boolean even = true; // условие повторения цикла
        // цикл перебора делителя
        while (even) {
            // проверка условия что оба числа делятся без остатка
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.println("Наибольший общий делитель: " + d); // если это так, то вывести число
                even = false; // и выйти из цикла
            }
            else {
                d++; // в противном случае увеличить делитель
            }
        }
    }
}
