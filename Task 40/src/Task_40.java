import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 40. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean x = gcdGeneral(a, b, c);

        if (x) {
            System.out.println("Numbers " + a + ", " + b + ", " + c + " are mutually simple");
        } else {
            System.out.println("Numbers are NOT mutually simple!!!");
        }
    }
    
    public static int gcd(int x, int y)
    {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }

    public static boolean gcdGeneral(int a, int b, int c) {
        if (gcd(a,b) == 1) {
            if (gcd(b,c) == 1) {
                if (gcd(c,a) == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}