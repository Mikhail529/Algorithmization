import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 23. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines N: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns M: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = 10 + ((int) (Math.random() * 90));
            }
        }

        System.out.println("\nOutput Matrix: \n");

        boolean sort;
        int temp;

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSort columns in ascending order: \n");

        for (int j = 0; j < matrix[0].length; j++) {
            sort = false;
            while (!sort) {
                sort = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        sort = false;
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSort columns in descending order: \n"); // по убыванию

        for (int j = 0; j < matrix[0].length; j++) {
            sort = false;
            while (!sort) {
                sort = true;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        sort = false;
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}