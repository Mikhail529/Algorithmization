import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 50. Написать программу, определяющую сумму n-значных чисел, содержащих только
        // нечетные цифры. Определить также, сколько четных цифр в найденной сумме.
        // Для решения задачи использовать декомпозицию

        int sum = findSum();
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The number of even digits in the sum: " + positivitNumbers(sum));
    }

    public static int findSum () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number containing only odd digits: ");
        int n = scanner.nextInt();
        int sum = 0;

        while (!(n == 0)) {

            while (!(positivitNumbers(n) == 0)) {
                System.out.println("This number has positive digits, enter n again:");
                n = scanner.nextInt();
            }

            sum += n;
            System.out.println("Enter a number containing only odd digits: ");
            System.out.println("Enter 0 to exit");
            n = scanner.nextInt();
        }
        return sum;
    }

    public static int positivitNumbers (int n) {
        int amountPositivity = 0;
        while (!(n == 0)) {
            int temp1 = 0;

            temp1 = n%10;
            if (temp1%2 == 0) {
                amountPositivity++;
            }
            n = n/10;
        }
        return amountPositivity;
    }

    // Проверяет число на четность, подключить функцию при необходимости
    public static int testNumbers (int n) {
        int k = 0;
        while (!(n == 0)) {
            n = n/10;
            k++;
        }
        System.out.println(k);
        return k;
    }
}