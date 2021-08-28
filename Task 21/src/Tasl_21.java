public class CLS {
    public static void main(String[] args) {

        // Task 21. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
        // в которых число 5 встречается три и болле раз

        int n = 10;
        int m = 20;
        int[][] matrix = new int[n][m];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = ((int) (Math.random() * 10));
            }
        }

        System.out.println("Output Matrix: \n");

        for (int i=0; i<n; i++) {
            System.out.print(i + " | ");
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nLine numbers in which the number 5 occurs three or more times: ");

        for (int i=0; i<n; i++) {
            int count = 0;
            for (int j=0; j<m; j++) {
                if (matrix[i][j] == 5) {
                    ++count;}
            }
            if (count >= 3) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}