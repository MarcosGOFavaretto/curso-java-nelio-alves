package entities;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Lines: ");
		int line = sc.nextInt();
		System.out.print("Columns: ");
		int column = sc.nextInt();

		int[][] matrix = new int[line][column];

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = sc.nextInt();

		System.out.print("Which number would you like to search? ");
		int choice = sc.nextInt();

		System.out.println("INFORMATIONS ABOUT NUMBER " + choice);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == choice) {
					System.out.println("Position: " + i + "," + j);
					if (j > 0)
						System.out.println("Left: " + matrix[i][j - 1]);
					if (j < column - 1)
						System.out.println("Right: " + matrix[i][j + 1]);
					if (i > 0)
						System.out.println("Up: " + matrix[i - 1][j]);
					if (i < line - 1)
						System.out.println("Down: " + matrix[i + 1][j]);
				}
			}
		}

		sc.close();
	}
}
