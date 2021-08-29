import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 37. Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления
        // площади треугольника

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sides of a regular hexagon A: ");
        double a = scanner.nextDouble();
        double temp = (6 * Square(a));
        System.out.println("The area of the hexagon is: " + temp);
    }

    public static double Square(double a) {

        // return ((3 * Math.sqrt(3)) / 2) * Math.pow(a, 2);

        double h = (a * Math.sqrt(3)) / 2;
        double R = (2 * h) / 3;
        double r = h / 3;

        return (a * h) / 2;
    }
}