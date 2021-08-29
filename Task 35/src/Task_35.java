import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 35. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
        // общего кратного двух натуральных чисел ( HOK(a,b) = (a*b) / HOD(a,b) )

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = scanner.nextInt();
        System.out.println("Enter number B: ");
        int b = scanner.nextInt();

        System.out.println();
        System.out.println("NOD: " + gcd(a,b) + "\n" + "NOK: " + lcm(a,b));
        boolean temp = (lcm(a,b) == (a*b) / gcd(a,b));
        System.out.println();
        System.out.println(temp);
    }

    public static int gcd (int a, int b) {         // НОД
        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else b = b % a;
        }
        return a + b;
    }

    public static int lcm (int a, int b) {          // НОК
        return a*b/gcd(a,b);
    }
}