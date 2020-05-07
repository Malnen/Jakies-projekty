package strategia;

public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    void quickSort(int array[], int x, int y) {
        int i, j, v, temp;
        i = x;
        j = y;
        v = array[(x + y) / 2];
        do {
            while (array[i] < v) {
                i++;
            }
            while (v < array[j]) {
                j--;
            }
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (x < j) {
            quickSort(array, x, j);
        }
        if (i < y) {
            quickSort(array, i, y);
        }
    }
}
