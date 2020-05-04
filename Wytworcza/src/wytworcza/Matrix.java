package wytworcza;

import java.util.Vector;

public abstract class Matrix {

    public Matrix(Vector<Integer>[][] matrix) {
        sampleMatrix = matrix;
    }

    protected Vector<Integer>[][] sampleMatrix;

    abstract protected void createMatrix();

    protected void print() {

        for (Vector<Integer>[] v : sampleMatrix) {
            System.out.print("|");
            for (Vector<Integer> v2 : v) {
                System.out.print(" " + v2.get(0) + " " + v2.get(1));
            }
            System.out.println(" |");
        }
    }
}
