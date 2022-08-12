public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {8, 1, 2, 4, 9, 3, 7, 0, 5, 6};

        runSort(list);

        for (int i:
             list) {
            System.out.print(list[i] + " ");
        }
    }

    public static void runSort(int[] list) {
        int temp;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] < list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
