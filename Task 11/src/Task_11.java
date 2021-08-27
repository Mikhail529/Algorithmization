import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 11. Дана матрица. Вывести на экран все нечётные столбцы, у которыхпервый элемент больше последнего

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of lines N: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of columns M: ");
        int m = scanner.nextInt();

        System.out.println();

        int[][] matrix = new int[n][m];

        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++) {
                matrix[i][j] = 10 + ((int) (Math.random() * 90));
            }

        System.out.println("\nOutput Matrix: \n");

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nOutput Answer: \n");

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (!(j%2 == 0) && matrix[0][j] > matrix[n-1][j]) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}