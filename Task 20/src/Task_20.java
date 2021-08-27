import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 20. Найти положительные элементы главной диагонали квадратной матрицы

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines N: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns M: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = ((int) (Math.random() * 100) -50);
            }
        }

        System.out.println("\nOutput Matrix: \n");

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nPositive matrix elements: ");

        for (int i=0; i<n; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + ", ");
            }
        }
        System.out.println();
    }
}