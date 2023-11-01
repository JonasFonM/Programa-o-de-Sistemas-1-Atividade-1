import Components.Matrix;

public class Main { 
    public static void main(String[] args) {
        Matrix mkMatrix = new Matrix();
        
        int[][] matrixA = mkMatrix.createMatrix('A');
        int[][] matrixB = mkMatrix.createMatrix('B');

        mkMatrix.compareMatrix(matrixA,matrixB);     

    }
}