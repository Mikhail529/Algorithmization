import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 16. Сформировать квадратную матрицу порядка n по заданому образцу (n-четное)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the square matrix with even number n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        if (n%2 == 0) {
            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix.length; j++) {
                    matrix[i][j] = 1;
                }
            }

            for (int i=0; i<matrix.length/2; i++) {
                for (int j=0; j<i; j++) {
                    matrix[i][j] = 0;
                    matrix[n-i-1][j] = matrix[i][j];
                }
            }

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix.length/2; j++) {
                    matrix[i][n-j-1] = matrix[i][j];
                }
            }

            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix.length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
        else System.out.println("Number is odd!");
    }
}