public class RecursiveSelectionSort {
    public static void main(String[] args) {
        double[] list = {2, 1, 3, 1, 2, 5, 2, -1, 0};
        sort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void sort(double[] list) {
        sort(list, 0, list.length - 1); // сортирует весь массив
    }

    private static void sort(double[] list, int low, int high) {
        if (low < high) {
            // Найти наименьший элемент и его индекс в list(low .. high)
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // Переставить наименьшее число в list(low .. high) и list(low)
            list[indexOfMin] = list[low];
            list[low] = min;

            // Отсортировать оставшийся list(low+1 .. high)
            sort(list, low + 1, high);
        }
    }
}
