import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// 4*. К калькулятору из предыдущего дз добавить логирование.

public class task_4 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_4.class.getName());
        FileHandler fh = new FileHandler("log_cal.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner input = new Scanner(System.in);

        System.out.println();

        System.out.print("Введите первое число: ");
        int number_1 = input.nextInt();
        logger.info("Пользователь ввёл первое число " + number_1);

        System.out.println();

        System.out.print("Введите оператора: ");
        char operator = input.next().charAt(0);
        logger.info("Пользователь ввёл оператора " + operator);

        System.out.println();

        System.out.print("Введите второе число: ");
        int number_2 = input.nextInt();
        logger.info("Пользователь ввёл второе число " + number_2);

        System.out.println();

        double result = 0;

        switch (operator) {

            case '+':
                result = number_1 + number_2;
                logger.info("Пользователь получил результат " + result);
                System.out.println(number_1 + " + " + number_2 + " = " + result);
                break;

            case '-':
                result = number_1 - number_2;
                logger.info("Пользователь получил результат " + result);
                System.out.println(number_1 + " - " + number_2 + " = " + result);
                break;

            case '*':
                result = number_1 * number_2;
                logger.info("Пользователь получил результат " + result);
                System.out.println(number_1 + " * " + number_2 + " = " + result);
                break;

            case '/':
                result = number_1 / number_2;
                logger.info("Пользователь получил результат " + result);
                System.out.println(number_1 + " / " + number_2 + " = " + result);
                break;

        }

        input.close();
        logger.warning("Программа закрыта!!!");

    }

}