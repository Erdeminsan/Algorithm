package bubblesort;

public class BubbleSort {

    void sort(int array[], int size) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    void print(int array[], int size_print) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String args[]) {

        int array[] = {64, 34, 25, 12, 22, 11, 90};

        BubbleSort bubble = new BubbleSort();
        bubble.sort(array, array.length);
        System.out.println("Sorted Array:..\n");
        bubble.print(array, array.length);
    }

}
