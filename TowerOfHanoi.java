import java.util.Scanner;

public class TowerOfHanoi {
    public static int recursionCalls = 0;    // счётчик количества вызовов рекурсий

    // main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество дисков: ");
        int n = input.nextInt();

        // Найти решение с помощью рекурсии
        System.out.println("Пошаговый алгоритм:");
        moveDisks(n, 'A', 'C', 'B');
        // Вывод количества вызовов рекурсии (формула: 2^n - 1), но мы посчитаем счётчиком
        System.out.println("Количество вызовов рекурсий " + recursionCalls);
    }

    // Находит решение для перемещения n дисков с fromTower на toTower с помощью auxTower
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        recursionCalls++; // увеличиваем счётчик рекурсивного вызова
        if (n == 1) // простой случай
            System.out.println("Переместите диск " + n + " с " + fromTower + " на " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Переместите диск " + n + " с " + fromTower + " на " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}