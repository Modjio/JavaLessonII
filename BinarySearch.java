public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {-3, 1, 2, 4, 9, 23};      // Значения должны быть упорядоченны
        System.out.println(binarySearch(list, 9));
    }

    /**
     * Применяет метод бинарного поиска ключа в массиве
     */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;     // Определяем середину
            if (key < list[mid])            // если искомое в первой половине
                high = mid - 1;
            else if (key == list[mid])      // если искомое по середине
                return mid;
            else
                low = mid + 1;      // если искомое во второй половине
        }

        return -1; // Теперь high < low
    }
}
