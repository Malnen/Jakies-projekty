package wytworcza;

import java.util.Random;
import java.util.Vector;

public class SparseMatrix extends Matrix {

    public SparseMatrix(Vector<Integer>[][] matrix) {
        super(matrix);
    }

    @Override
    public void createMatrix() {

        int limit = (int) (sampleMatrix.length * sampleMatrix[0].length) / 2;
        sampleMatrix = new Vector[sampleMatrix.length][sampleMatrix[0].length];
        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                if (i == j) {
                    sampleMatrix[i][j] = new Vector<Integer>();
                    sampleMatrix[i][j].add(1);
                    sampleMatrix[i][j].add(1);
                } else {
                    sampleMatrix[i][j] = new Vector<Integer>();
                    sampleMatrix[i][j].add(0);
                    sampleMatrix[i][j].add(0);
                }

            }
        }
    }
}
