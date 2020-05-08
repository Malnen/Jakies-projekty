package strategia;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sorter {

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

    public void testOnRandomArrays() {
        System.out.println("Sortowanie QuickSort");
        setSortStrategy(new QuickSortStrategy());
        sortOnRandom(10, 10);
        sortOnRandom(10, 100);
        sortOnRandom(10, 1000);
        sortOnRandom(10, 10000);
        sortOnRandom(10, 100000);
        sortOnRandom(10, 1000000);

        System.out.println("");

        System.out.println("Sortowanie Arrays.sort()");
        setSortStrategy(new JavaSortStrategy());
        sortOnRandom(10, 10);
        sortOnRandom(10, 100);
        sortOnRandom(10, 1000);
        sortOnRandom(10, 10000);
        sortOnRandom(10, 100000);
        sortOnRandom(10, 1000000);

        System.out.println("");

        System.out.println("Sortowanie BubbleSort");
        setSortStrategy(new BubbleSortStrategy());
        sortOnRandom(10, 10);
        sortOnRandom(10, 100);
        sortOnRandom(10, 1000);
        sortOnRandom(10, 10000);
       // sortOnRandom(10, 100000); // okolo 13 sekund
       // sortOnRandom(10, 1000000); // okolo 1300 sekund (21 minut)

        System.out.println("");

        System.out.println("Sortowanie SelectionSort");
        setSortStrategy(new SelectionSortStrategy());
        sortOnRandom(10, 10);
        sortOnRandom(10, 100);
        sortOnRandom(10, 1000);
        sortOnRandom(10, 10000);
       // sortOnRandom(10, 100000); // okolo 15 sekund
       // sortOnRandom(10, 1000000); // okolo 1300 sekund 
    }

    public void testOnSameArray() {
        sortOnSame(10, 10);
        sortOnSame(10, 100);
        sortOnSame(10, 1000);
        sortOnSame(10, 10000);
        //sortOnSame(10, 100000);
        //sortOnSame(10, 1000000);
    }

    void sortOnSame(int n, int nn) {// n ilosc powtorzen nn ilosc elementow
        long avgTime = 0;
        long startTime;
        long sortTime;
        int baseArray[] = new int[nn];
        randomFill(baseArray);
        System.out.println("Ilość elementów : " + nn + ", ");
        for (int s = 0; s < 4; s++) {
            avgTime = 0;
            switch (s) {
                case 0:
                    setSortStrategy(new JavaSortStrategy());
                    System.out.print("Arrays.sort() ");
                    break;
                case 1:
                    setSortStrategy(new QuickSortStrategy());
                    System.out.print("QuickSort ");
                    break;
                case 2:
                    setSortStrategy(new BubbleSortStrategy());
                    System.out.print("BubbleSort ");
                    break;
                case 3:
                    setSortStrategy(new SelectionSortStrategy());
                    System.out.print("SelectionSort ");
                    break;
            }
            for (int i = 0; i < n; i++) {
                int array[] = Arrays.copyOf(baseArray, baseArray.length);
                startTime = System.nanoTime();
                strategy.sort(array);
                sortTime = System.nanoTime() - startTime;
                avgTime += sortTime;
            }
            avgTime /= n;
            System.out.println("Sredni czas: " + (double) avgTime / 1_000_000_000 + " sekund.");
        }
        System.out.println("");
    }

    void sortOnRandom(int n, int nn) {// n ilosc powtorzen nn ilosc elementow
        long avgTime = 0;
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
            array[i] = (int) (random.nextDouble() * 100000);
        }
    }

}
