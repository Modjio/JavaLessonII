/*
Напишите программу, которая находит минимальную процентную ставку по кредиту в разных банках.
 */

public class RateSearch {
    public static void main(String[] args) {
        double minRate;     // минимальная процентная ставка

        double[] rates = {7, 9, 10.5, 5.5, 12, 8.7, 6.9};        // массив ставок в банке

        minRate = rates[0];     // присвоили первое значение ставки для сравнения с остальными

        // перебор массива foreach
        for (double i:
             rates) {
            if (minRate > i)     // условие, при котором если ставка ниже, присвоить значение
                minRate = i;
        }

        // вывод результата
        System.out.println(minRate);

    }
}
