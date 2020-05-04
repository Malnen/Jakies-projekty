package wytworcza;

import java.util.Random;
import java.util.Vector;

public class SparseMatrix extends Matrix {

    public SparseMatrix(int x, int y) {
        super(x, y);
    }

    @Override
    public Vector<Integer>[][] createMatrix(int x, int y) {

        Vector<Integer>[][] sampleMatrix = new Vector[4][4];
        int limit = (int) (x * y) / 2;
        sampleMatrix = new Vector[x][y];
        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                    sampleMatrix[i][j] = new Vector<Integer>();
                if (i == j) {
                    sampleMatrix[i][j].add(1);
                    sampleMatrix[i][j].add(1);
                } else {
                    sampleMatrix[i][j].add(0);
                    sampleMatrix[i][j].add(0);
                }

            }
        }
        return sampleMatrix;
    }
}
