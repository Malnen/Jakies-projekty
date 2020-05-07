
package strategia;

import java.util.Arrays;


public class JavaSortStrategy implements SortStrategy{

    @Override
    public void sort(int[] array) {
        Arrays.sort(array);
    }
    
}
