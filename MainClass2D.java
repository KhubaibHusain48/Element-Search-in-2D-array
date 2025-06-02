package Array2D;

import java.util.Scanner;

public class MainClass2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = UtilityClass.utilitiyMethod();

        System.out.print("Enter Number You Want To Search: ");
        int num = sc.nextInt();

        boolean isFound = IsFoundElementCode.search(arr, num);

        if (isFound) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }
    }
}
