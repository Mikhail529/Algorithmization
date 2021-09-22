import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 47. Два простых числа называются "близнецами", если они отличаются друг от друга на 2
        // (например 41 и 43). Найти и напечатать все пары "близнецов" на отрезке [n, 2n],
        // где n-заданое натуральное число больше 2. Для решения задачи использовать декомпозицию

        // Task 48. Натуральное число, в записи которого n цифр, называют числом Армстронга, если
        // сумма его цифр, возведена в степень n, равна самому числу. Найти все числа Армстронга
        // от 1 до k. Для решения задачи использовать декомпозицию

        ArmstrongNumber(Enter());
    }

    public static int Enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number k: ");
        return scanner.nextInt();
    }

    public static void ArmstrongNumber (int k) {
        for (int i=0; i<=k; i++) {
            double sum = 0;
            String[] arrayStr = String.valueOf(i).split("");
            for (String s : arrayStr) {
                sum += Math.pow(Double.parseDouble(s), arrayStr.length);
            }
            if (i == sum) {
                System.out.println("Armstrong number: " + (int) sum);
            }
        }
    }
}