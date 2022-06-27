/*
Напишите программу, которая вычисляет и отображает наибольший общий делитель (далее — НОД) двух чисел.
 */

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
        // цикл перебора делителя
        while (d <= n1 && d <= n2) {
            // проверка условия что оба числа делятся без остатка
            if (n1 % d == 0 && n2 % d == 0) {
                System.out.println("Наибольший общий делитель: " + d); // если это так, то вывести число
                break; // и выйти из цикла
            }
            else {
                d++; // в противном случае увеличить делитель
            }
        }
    }
}
