import java.util.Arrays;
import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 7. Даны действительные числа a1,a2,...,an. Найти max(a1+a2n,a2+a2n-1,...an+an+1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        for (int i=0; i<array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(array));

        double maxSum = array[0] + array[array.length - 1];
        for(int i = 1; i < array.length / 2; i++){
            if((array[i] + array[array.length - i - 1]) > maxSum){
                maxSum = array[i] + array[array.length - i - 1];
            }
        }

        System.out.println("Максимальная сумма: " + maxSum);
    }
}