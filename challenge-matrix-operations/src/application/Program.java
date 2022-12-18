package application;

import entities.MatrixUtils;

import java.util.Scanner;

public class Program {

    /**
     * This application makes some mathematics operations with matrices.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixA;
        int[][] matrixB;
        int choice;

        do {
            System.out.println("Welcome! This application makes some mathematics operations with matrices.\nPlease, chose an option below:");
            System.out.println("1 - Sum between two matrices.");
            System.out.println("2 - Subtraction between two matrices.");
            System.out.println("3 - Multiplication with a number.");
            System.out.println("4 - Multiplication between two matrices.");
            System.out.println("5 - Determinant.");
            System.out.println("0 - Exit.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("SUM BETWEEN TWO MATRICES");

                    System.out.println("[MAIN MATRIX]");
                    matrixA = readMatrix(scanner);
                    System.out.println("[SECONDARY MATRIX]");
                    matrixB = readMatrix(scanner);

                    printMatrix(MatrixUtils.sumMatrices(matrixA, matrixB));
                    break;

                case 2:
                    System.out.println("SUBTRACTION BETWEEN TWO MATRICES");

                    System.out.println("[MAIN MATRIX]");
                    matrixA = readMatrix(scanner);
                    System.out.println("[SECONDARY MATRIX]");
                    matrixB = readMatrix(scanner);

                    printMatrix(MatrixUtils.subtractMatrices(matrixA, matrixB));
                    break;

                case 3:
                    System.out.println("MULTIPLICATION WITH A NUMBER");

                    System.out.println("[MAIN MATRIX]");
                    matrixA = readMatrix(scanner);
                    System.out.println("[MULTIPLICATIVE FACTOR]");
                    int multiplicativeFactor = scanner.nextInt();

                    printMatrix(MatrixUtils.multiplyMatrix(matrixA, multiplicativeFactor));
                    break;

                case 4:
                    System.out.println("MULTIPLICATION BETWEEN TWO MATRICES");
                    System.out.println("To be Implemented");
                    break;

                case 5:
                    System.out.println("DETERMINANT");
                    System.out.println("To be Implemented");
                    break;

                case 0:
                    System.out.println("EXIT");
                    System.out.println("Goodbye ;D");
                    break;

            }
        }
        while (choice != 0);

        scanner.close();
    }

    public static int[][] readMatrix(Scanner scanner) {
        System.out.print("Insert the quantity of lines: ");
        int lines = scanner.nextInt();

        System.out.print("Insert the quantity of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[lines][columns];

        System.out.println("Insert the content of the matrix below!");
        scanner.nextLine();

        for (int i = 0; i < lines; i++) {
            String[] values = scanner.nextLine().split(" ");
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("[RESULT]");
        for (int[] values : matrix) {
            StringBuilder lineValues = new StringBuilder();
            for (int anInt : values) {
                lineValues.append(anInt).append(" ");
            }
            System.out.println(lineValues);
        }
        System.out.println("---------------");
    }
}