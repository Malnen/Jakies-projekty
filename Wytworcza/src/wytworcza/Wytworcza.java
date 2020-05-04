package wytworcza;

import java.util.Vector;

public class Wytworcza {

    public static void main(String[] args) {

        Matrix sm = new SparseMatrix(4, 7);
        sm.print();
        
        System.out.println("");
        
        Matrix dm = new DenseMatrix(12, 12);
        dm.print();
        
        
    }

}
