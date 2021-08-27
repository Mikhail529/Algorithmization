import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 14. Сформировать квадратную матрицу порядка n по заданому образцу (n-четное)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the square matrix with even number n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int count = 0;

        if (n%2 == 0) {
            for (int i=0; i<matrix.length; i++) {
                for (int j=0; j<matrix.length; j++) {
                    if (i%2 == 0) {
                        count++;
                        matrix[i][j] = count;
                    }
                    if (!(i%2 == 0)) {
                        matrix[i][j] = count;
                        count--;
                    }
                }
            }
            System.out.println("\nOutput Matrix: \n");

            for (int[] ints : matrix) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Number is odd!");
    }
}