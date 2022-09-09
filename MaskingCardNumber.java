/*
Напишите программу, которая маскирует номер банковской карты таким образом,
 чтобы в консоли отображались только четыре последних символа,
  а все остальные были заменены на символ *.
  Если входная строка содержит не больше четырех символов, то вернуть входную строку.
 */

import java.util.Scanner;

public class MaskingCardNumber {
    public static void main(String[] args) {
        String cardNumber;

        Scanner input = new Scanner(System.in);

        // Получить номер карты
        System.out.print("Введите номер карты для маскирования: ");
        cardNumber = input.nextLine();

        System.out.print("Карта после маскирования: ");

        // Если чисел 4 и меньше
        if (cardNumber.length() < 5) {
            // то просто выводим эти числа
            System.out.println(cardNumber);
        } else {
            // если больше 4, то выводим звёздочки
            for (int i = 0; i < cardNumber.length() - 4; i++) {
                System.out.print("*");
            }
            // и оставшиеся 4 числа
            System.out.println(cardNumber.substring(cardNumber.length() - 4));
        }
    }
}
