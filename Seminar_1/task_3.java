import java.util.Scanner;

// 3. Реализовать простой калькулятор

/**
 * task_3
 */
public class task_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();

        System.out.print("Введите первое число: ");
        int number_1 = input.nextInt();

        System.out.println();

        System.out.print("Введите оператора: ");
        char operator = input.next().charAt(0);

        System.out.println();

        System.out.print("Введите второе число: ");
        int number_2 = input.nextInt();

        System.out.println();

        double result = 0;

        switch (operator) {

            case '+':
                result = number_1 + number_2;
                System.out.println(number_1 + " + " + number_2 + " = " + result);
                break;

            case '-':
                result = number_1 - number_2;
                System.out.println(number_1 + " - " + number_2 + " = " + result);
                break;

            case '*':
                result = number_1 * number_2;
                System.out.println(number_1 + " * " + number_2 + " = " + result);
                break;

            case '/':
                result = number_1 / number_2;
                System.out.println(number_1 + " / " + number_2 + " = " + result);
                break;

        }

        input.close();

    }

}