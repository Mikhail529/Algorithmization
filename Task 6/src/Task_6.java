import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 6. Дана последовательность N вещественных чисел. Вычислить сумму чисел,
        // порядковые номера которых являются простыми числами

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }

        System.out.println(Arrays.toString(array));

        double sum = 0;

        for (int j=2; j<size; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " "); // Дополнительно выводит элементы массива для проверки
                sum += array[j];
            }
        }
        System.out.println("The Summa is: " + sum);
    }
}