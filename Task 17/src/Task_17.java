import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 17. Сформировать квадратную матрицу порядка N по правилу A[I,J] = sin((I^2 - J^2) / N)
        // и подсчитать количество положительных элементов в ней

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the square matrix with even number N: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        int k = 0;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[i][j] = ((int) (Math.random() * 100) );
            }
        }

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    k++;
                }
            }
        }

        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%10f", doubles[j]);
            }
            System.out.println();
        }
        System.out.println("Number of positive elements: " + k);
    }
}