import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 15. Сформировать квадратную матрицу порядка n по заданому образцу (n-четное)
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the square matrix with even number n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int count = 1;

        if (n%2 == 0) {
            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<n-i; j++) {
                    matrix[i][j] = count;
                }
                count++;
            }
            System.out.println("\nOutput Matrix: \n");

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Number is odd!");
    }
}