/*
Напишите программу, которая вычисляет полную стоимость товара.
 Данные, используемые для расчета: стоимость единицы товара в рублях,
  количество единиц товара, включение/не включение НДС (20%) в стоимость товара.
   Если количество единиц товара больше или равно 10, то действует скидка 5%.

   P.S. используя перегруженные методы
 */

import java.util.Scanner;

public class CalculatingCostGoods {

    static double fullPrice; // полная стоимость
    static final double WHOLESALE = 0.95; // скидка на оптовый заказ

    // Метод без НДС
    public static void method(double price, int amount) {
        // если товара >= 10 то 5% скидка
        if (amount >= 10) {
            fullPrice = price * amount * WHOLESALE;
        }
        else { // если нет, то скидки нет
            fullPrice = price * amount;
        }
        // вывод полной стоимости товара
        System.out.println("\nПолная стоимость позиции \"Слон\" состовляет " + (int)(fullPrice * 100) / 100.0 + " руб. без НДС");
    }

    // Метод с НДС 20%
    public static void method(double price, int amount, double tax) {
        // если товара >= 10 то 5% скидка
        if (amount >= 10) {
            fullPrice = price * amount * WHOLESALE * tax;
        }
        else { // если нет, то скидки нет
            fullPrice = price * amount * tax;
        }
        // вывод полной стоимости товара
        System.out.println("\nПолная стоимость позиции \"Слон\" состовляет " + (int)(fullPrice * 100) / 100.0 + " руб. с учётом НДС 20%");
    }

    public static void main(String[] args) {
        // Вводные данные
        double price; // цена товара
        int amount; // количество товара
        String tax; // проверка на необходимость НДС
        final double TAX = 1.2; // НДС 20%

        Scanner input = new Scanner(System.in);

        // Стоимость единицы товара
        System.out.print("Введите стоимость товара \"Слон\" в рублях: ");
        price = input.nextDouble();

        // Количество единиц товара
        System.out.print("Введите количество единиц: ");
        amount = input.nextInt();

        // Стоимость с НДС 20% ? да/нет
        System.out.print("Произвести расчёт с НДС? (y/n) ");
        tax = input.next();

        // если первый символ Y или y запросить метод с НДС
        if (tax.charAt(0) == 'y' || tax.charAt(0) == 'Y') {
            method(price, amount, TAX);
        } else {
            method(price, amount);
        }
    }
}