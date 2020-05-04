package wytworcza;

import java.util.Vector;

public abstract class Matrix {

    public Matrix(int x, int y) {
        sampleMatrix = createMatrix(x, y);
    }

    protected Vector<Element>[][] sampleMatrix;

    abstract protected Vector<Element>[][] createMatrix(int x, int y);

    protected void print() {

        for (Vector<Element>[] v : sampleMatrix) {
            System.out.print("|");
            for (Vector<Element> v2 : v) {
                System.out.print(" " + v2.get(0).value + " " + v2.get(1).value);
            }
            System.out.println(" |");
        }
    }
}
