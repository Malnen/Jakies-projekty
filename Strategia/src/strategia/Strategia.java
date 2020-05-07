
package strategia;

public class Strategia {

    public static void main(String[] args) {
        
        Sorterer sorterer = new Sorterer();
        
        System.out.println("Sortowanie QuickSort");
        sorterer.setSortStrategy(new QuickSortStrategy());
        sorterer.testSort(10,10);
        sorterer.testSort(10,100);
        sorterer.testSort(10,1000);
        sorterer.testSort(10,10000);
        sorterer.testSort(10,100000);
        sorterer.testSort(10,1000000); 
        
        System.out.println("");
        
        System.out.println("Sortowanie Arrays.sort()");
        sorterer.setSortStrategy(new JavaSortStrategy());
        sorterer.testSort(10,10);
        sorterer.testSort(10,100);
        sorterer.testSort(10,1000);
        sorterer.testSort(10,10000);
        sorterer.testSort(10,100000);
        sorterer.testSort(10,1000000); 
        
        
        System.out.println("");
        
        System.out.println("Sortowanie BubbleSort");
        sorterer.setSortStrategy(new BubbleSortStrategy());
        sorterer.testSort(10,10);
        sorterer.testSort(10,100);
        sorterer.testSort(10,1000);
        sorterer.testSort(10,10000);
        sorterer.testSort(10,100000);
        sorterer.testSort(10,1000000); 
        
          System.out.println("");
        
        System.out.println("Sortowanie SelectionSort");
        sorterer.setSortStrategy(new SelectionSortStrategy());
        sorterer.testSort(10,10);
        sorterer.testSort(10,100);
        sorterer.testSort(10,1000);
        sorterer.testSort(10,10000);
        sorterer.testSort(10,100000);
        sorterer.testSort(10,1000000); 
    }
    
}
