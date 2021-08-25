import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 3. Дан массив действительных чисел, размерность которого N. Посчитать, сколько в нем
        // отрицательных, положительных и нулевых элементов

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(array));

        int kPlus = 0;
        int kMinus = 0;
        int kZero = 0;

        for (int j : array) {
            if (j > 0)
                ++kPlus;
            else if (j < 0)
                ++kMinus;
            else ++kZero;
        }
        System.out.println("Number of positive elements: " + kPlus);
        System.out.println("Number of negative elements: " + kMinus);
        System.out.println("Number of elements equal to zero: " + kZero);
    }
}