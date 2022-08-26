package countingsort;

public class CountingSort {

    void sort(int array[]) {
        int max = array.length;

        int[] array_stored = new int[array.length + 1];
        int[] count = new int[array.length + 1];

        for (int i = 0; i < array_stored.length; i++) {
            array_stored[i] = 0;
        }
        for (int i = 0; i < count.length; i++) {
            count[array[i]]++;
        }
    }

    void print(int array[], int size_print) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        CountingSort count = new CountingSort();
        int array[] = {64, 34, 25, 12, 22, 11, 90};

        count.sort(array);
        count.print(array, 7);

    }

}
