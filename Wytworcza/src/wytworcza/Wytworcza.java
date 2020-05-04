package wytworcza;

import java.util.Vector;

public class Wytworcza {

    public static void main(String[] args) {

        Matrix sm = new SparseMatrix(new Vector[4][7]);
        sm.createMatrix();
        sm.print();
        
        System.out.println("");
        
        Matrix dm = new DenseMatrix(new Vector[12][12]);
        dm.createMatrix();
        dm.print();
        
        
    }

}
