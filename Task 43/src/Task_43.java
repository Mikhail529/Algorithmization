import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 43. Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод(методы) вычисления
        // его площади если угол между сторонами длиной X и Y - прямой

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: "); // a
        int x = scanner.nextInt();
        System.out.println("Enter y: "); // b
        int y = scanner.nextInt();
        System.out.println("Enter z: "); // c
        int z = scanner.nextInt();
        System.out.println("Enter t: "); // d
        int t = scanner.nextInt();

        System.out.println("Quadrangle area: " + hypotenuse(x, y, z, t));
    }
    
    public static float hypotenuse (int x, int y, int z, int t) {
        float hypotenuse = (float) Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)));  // Длина hypotenuse
        float s1 = (float) (0.5 * x * y);   // Площадь треугольника с острым углом
        float p = (hypotenuse + z + t) / 2; // Полупериметр
        float s2 = (float) Math.sqrt(p*(p-hypotenuse)*(p-z)*(p-t)); // Площадь четырехугольника

        return s1+s2;
    }
}