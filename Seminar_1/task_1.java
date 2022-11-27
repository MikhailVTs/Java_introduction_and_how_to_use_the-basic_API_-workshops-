// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

/**
 * task_1
 */

import java.util.*;

public class task_1 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Факториал числа = " + getFactorial());
        System.out.println();
        System.out.println("Треугольное число = " + getTriangularnumber());
    }

    public static int getFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число факториала (n!): ");
        int f = input.nextInt();
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }

        return result;
    }

    public static int getTriangularnumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите n-ое треугольного число: ");
        int number = input.nextInt();
        int result = (number + 1) * number / 2;
        input.close();
        return result;

    }

}
