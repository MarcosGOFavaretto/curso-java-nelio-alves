package entities;

public class MatrixUtils {

    public static int[][] sumMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrix(int[][] matrixA, int multiplicativeFactor) {
        int[][] result = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                result[i][j] = matrixA[i][j] * multiplicativeFactor;
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        return null;
    }

    public static int[][] determinant(int[][] matrixA) {
        return null;
    }
}