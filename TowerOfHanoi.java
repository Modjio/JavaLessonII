import java.util.Scanner;

public class TowerOfHanoi {
    public static int i = 0;    // счетчик количства вызовов рекурсий

    // main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество дисков: ");
        int n = input.nextInt();

        // Найти решение с помощью рекурсии
        System.out.println("Пошаговый алгоритм:");
        moveDisks(n, 'A', 'C', 'B');
        // Вывод количества вызовов рекурсии (формула: 2^n - 1)
        System.out.println("Количество вызовов рекурсий " + i);
    }

    // Находит решение для перемещения n дисков с fromTower на toTower с помощью auxTower
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        i++; // увеличиваем счетчик рекурсивного вызова
        if (n == 1) // простой случай
            System.out.println("Переместите диск " + n + " с " + fromTower + " на " + toTower);
        else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Переместите диск " + n + " с " + fromTower + " на " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}