import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 12. Дана квадратная матрица. Вывести на экран элименты, стоящие на диагонали

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number matrix: ");
        int n = scanner.nextInt();
        int m;
        m = n;
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

        System.out.println("\nOutput Answer: \n");

        System.out.println("Элементы главной диагонали: ");
        for (int i=0; i<n; i++) {
            System.out.print(matrix[i][i] + ", ");
        }

        System.out.println("\n");

        System.out.println("Элементы побочной диагонали:  ");
        for (int i=0; i<n; i++) {
            System.out.print(matrix[i][n-1-i] + ", ");
        }
        System.out.println("\n");
    }
}