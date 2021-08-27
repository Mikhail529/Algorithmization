import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 13. Дана матрица. Вывести k-ю строку и p-й столбец матрицы

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines N: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns M: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i=0;i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = 10 + ((int) (Math.random() * 90));
            }
        }

        System.out.println("\nOutput Matrix: \n");

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Enter the number lines K: ");
        int k = scanner.nextInt();
        System.out.println("Enter the number columns P: ");
        int p = scanner.nextInt();

        System.out.println("\nOutput line number " + k + ": ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (k == i)
                    System.out.print(matrix[i][j] + ", ");
            }
        }

        System.out.println("\n\nOutput columns number " + p +  ": ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (p == j)
                    System.out.print(matrix[i][j] + ", ");
            }
        }
        System.out.println();
    }
}