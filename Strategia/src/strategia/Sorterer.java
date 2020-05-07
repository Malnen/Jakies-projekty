package strategia;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sorterer {

    public void sortArray(int array[]) {
        strategy.sort(array);
    }

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
    private SortStrategy strategy;

    public void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void testSort(int n, int nn) {// n ilosc powtorzen nn ilosc elementow
        double avgTime = 0;
        long startTime;
        long sortTime;

        System.out.print("Ilość elementów : " + nn + ", ");
        for (int i = 0; i < n; i++) {
            int array[] = new int[nn];
            randomFill(array);
            startTime = System.nanoTime();
            strategy.sort(array);
            sortTime = System.nanoTime() - startTime;
            avgTime += sortTime;
        }
        avgTime /= n;
        System.out.println("Sredni czas: " + (double) avgTime / 1_000_000_000 + " sekund.");

    }

    void randomFill(int array[]) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random.nextDouble() * array.length * 10);
        }
    }

}
