package wytworcza;

import java.util.Vector;

public class DenseMatrix extends Matrix {

    public DenseMatrix(int x, int y) {
        super(x, y);
    }

    @Override
    public Vector<Integer>[][] createMatrix(int x, int y){

        Vector<Integer>[][] sampleMatrix = new Vector[x][y];
        int limit = (int) (x * y) / 2;
        sampleMatrix = new Vector[x][y];
        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                    sampleMatrix[i][j] = new Vector<Integer>();
                if (i != j) {
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
