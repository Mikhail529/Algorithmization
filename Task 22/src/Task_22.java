import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 22. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
        
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

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSort matrix in ascending order: \n");

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                for (int ix=0; ix<m-1; ix++) {
                    for (int jx=m-1; jx>ix; jx--) {
                        if (matrix[i][jx-1] > matrix[i][jx]) {
                            int temp = matrix[i][jx-1];
                            matrix[i][jx-1] = matrix[i][jx];
                            matrix[i][jx] = temp;
                        }
                    }
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSort matrix in descending order: \n");

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                for (int ix=0; ix<m-1; ix++) {
                    for (int jx=m-1; jx>ix; jx--) {
                        if (matrix[i][jx-1] < matrix[i][jx]) {
                            int temp = matrix[i][jx-1];
                            matrix[i][jx-1] = matrix[i][jx];
                            matrix[i][jx] = temp;
                        }
                    }
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}