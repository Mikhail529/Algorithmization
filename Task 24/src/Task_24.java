import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 24. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
        // причем в каждом столбце число единиц равно номеру столбца

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrix: ");
        int n = scanner.nextInt();
        int m =n;

        int[][] matrix = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = (int) (Math.random() * 1);
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                if (j>i) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}