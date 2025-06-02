package Array2D;

import java.util.Scanner;

public class UtilityClass {
    public static int[][] utilitiyMethod() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Number of Columns: ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element of Rows " + (i + 1) + " and Columns " + (j + 1) + ": ");
                array[i][j] = sc.nextInt();
            }
        }

        return array;
    }
}
