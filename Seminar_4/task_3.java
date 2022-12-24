// 3. В калькулятор добавьте возможность отменить последнюю операцию.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class task_3 {
    static Scanner input = new Scanner(System.in);
    


    public static void main(String[] args) throws IOException {
        
        Logger logger = Logger.getLogger(task_3.class.getName());
        FileHandler fh = new FileHandler("log_calc.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        String answer;
        int number_1;
        int number_2;
        char operator;
        
        number_1 = inputNumber1();
        logger.info("Пользователь ввёл первую цифру " + number_1);


        System.out.println("Продолжить или вернуться на шаг назад y/n");
        
        answer = input.next().trim().toLowerCase();


        if (answer.equals("y")) {

            logger.info("Пользователь решил продолжить " + answer);
           

            operator = inputOperator();
            logger.info("Пользователь выбрал оператора " + operator);
          

            System.out.println("Продолжить или вернуться на шаг назад y/n");
            answer = input.next().trim().toLowerCase();


            if (answer.equals("y")) {

                logger.info("Пользователь решил продолжить " + answer);
              

                number_2 = inputNumber2();
                logger.info("Пользователь ввёл вторую цифру " + number_2);
           

                operation(number_1, number_2, operator);
                logger.info("Пользователь закончил расчёт");
       

            }
            if (answer.equals("n")) {

  
                logger.info("Пользователь решил вернуться на шаг назад " + answer);
             

                operator = inputOperator();
                logger.info("Пользователь выбрал оператора " + operator);
          


                System.out.println("Продолжить или вернуться на шаг назад y/n");
                answer = input.next().trim().toLowerCase();


                if (answer.equals("y")) {

                    logger.info("Пользователь решил продолжить " + answer);
            

                    number_2 = inputNumber2();
                    logger.info("Пользователь ввёл вторую цифру " + number_2);
                 

                    operation(number_1, number_2, operator);
                    logger.info("Пользователь закончил расчёт");
                    
                }
            }
            

        } 
        else if (answer.equals("n")) {

            logger.info("Пользователь решил вернуться на шаг назад " + answer);
          

            number_1 = inputNumber1();
            logger.info("Пользователь ввёл первую цифру " + number_1);
            

            System.out.println("Продолжить или вернуться на шаг назад y/n");
            answer = input.next().trim().toLowerCase();


            if (answer.equals("y")) {

                logger.info("Пользователь решил продолжить " + answer);
    

                operator = inputOperator();
                logger.info("Пользователь выбрал оператора " + operator);
                


                System.out.println("Продолжить или вернуться на шаг назад y/n");
                answer = input.next().trim().toLowerCase();


                if (answer.equals("y")) {

                    logger.info("Пользователь решил продолжить " + answer);
                    



                    number_2 = inputNumber2();
                    logger.info("Пользователь ввёл вторую цифру " + number_2);
                    

                    operation(number_1, number_2, operator);
                    logger.info("Пользователь закончил расчёт");
                    
         
                }
                if (answer.equals("n")) {

                    logger.info("Пользователь решил вернуться на шаг назад " + answer);
                    

                    operator = inputOperator();
                    logger.info("Пользователь выбрал оператора " + operator);
                   


                    System.out.println("Продолжить или вернуться на шаг назад y/n");
                    answer = input.next().trim().toLowerCase();

                    if (answer.equals("y")) {

                        logger.info("Пользователь решил продолжить " + answer);
                       

                        number_2 = inputNumber2();
                        logger.info("Пользователь ввёл вторую цифру " + number_2);
                        

                        operation(number_1, number_2, operator);
                        logger.info("Пользователь закончил расчёт");
                       
                    }
                }
            }

        } 
        else {

            System.out.println("Что - то пошло не так! Убедитесь, что Вы ввели правильно y/n");
            logger.warning(answer + " Что - то пошло не так! Убедитесь, что Вы ввели правильно y/n");
            
        } 

    }



    public static int inputNumber1(){
        int number_1;

        System.out.println();

        System.out.print("Введите первое число: ");
        number_1 = input.nextInt();

        
        return number_1;
    }

    public static char inputOperator() {

        char operator;
        System.out.println();

        System.out.print("Введите оператора: ");
        operator = input.next().charAt(0);

        return operator;
    }

    public static int inputNumber2() {
        int number_2;

        
        System.out.println();

        System.out.print("Введите второе число: ");
        number_2 = input.nextInt();

        
        return number_2;
        
    }


    public static double operation(int number_1, int number_2, char operator) {
        
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
        return result;
    
    }

}

