import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 45. Написать метод(методы), определяющий в каком из данных двух чисел больше цифр

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number n2: ");
        int n2 = scanner.nextInt();

        funcNumbers(n1, n2);
    }

    public static void funcNumbers (int n1, int n2) {

        String[] arrayStr1 = String.valueOf(n1).split("");
        String[] arrayStr2 = String.valueOf(n2).split("");

        if (arrayStr1.length > arrayStr2.length) {
            System.out.println("There are more digits in the number " + n1 + " than in " + n2);
        }
        else if (arrayStr1.length < arrayStr2.length) {
            System.out.println("There are more digits in the number " + n2 + " than in " + n1);
        }
        else {
            System.out.println("The number of digits in the numbers " + n1 + " and " + n2 + " are equal");
        }
    }
}