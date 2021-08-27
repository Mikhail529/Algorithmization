import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 18. В числовой матрице поменять местами два столбца любых столбца, т.е. все элементы одного
        // столбца поставить на соответствующие им позиции другого, а его элименты второго переместить на первый.
        // Номера столбцов вводит пользователь с клавиатуры

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

        System.out.println("\nOutput matrix: \n");

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Enter number columns xOne: ");
        int xOne = scanner.nextInt();
        System.out.println("Enter number columns xTwo: ");
        int xTwo = scanner.nextInt();

        System.out.println();

        if (xOne >= 0 && xOne < m && xTwo >= 0 && xTwo < m) {
            for (int i=0; i<n; i++) {
                matrix[i][xOne] = matrix[i][xOne] + matrix[i][xTwo];
                matrix[i][xTwo] = matrix[i][xOne] - matrix[i][xTwo];
                matrix[i][xOne] = matrix[i][xOne] - matrix[i][xTwo];
            }

            for (int i=0; i<n; i++) {
                System.out.print(i + " | ");
                for (int j=0; j<m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Error entering one of the numbers");

        System.out.println();
    }
}