import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 19. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
        // Определить какой столбец содержит максимальную сумму

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

        int maxSum = 0;

        System.out.println();

        for (int j=0; j<m; j++) {
            int tempSum = 0;
            for (int i=0; i<n; i++) {
                tempSum += matrix[i][j];
            }
            System.out.print(tempSum + ", ");
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        System.out.println("\nMax Sum: " + maxSum);
    }
}