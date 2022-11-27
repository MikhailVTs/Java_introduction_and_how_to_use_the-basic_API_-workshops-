// 2. Вывести все простые числа от 1 до 1000

/**
 * task_2
 */
public class task_2 {

    public static void main(String[] args) {
        int numberFrom = 0;
        int numberBefore = 0;

        String primeNumbers = "";

        for (numberFrom = 1; numberFrom <= 1000; numberFrom++) {
            int counter = 0;
            for (numberBefore = numberFrom; numberBefore >= 1; numberBefore--) {
                if (numberFrom % numberBefore == 0) {
                    counter = counter + 1;
                }
            }

            if (counter == 2) {
                primeNumbers = primeNumbers + numberFrom + " ";
            }

        }
        System.out.println();
        System.out.print("Простые числа от 1 до 1000 - ");
        System.out.println(primeNumbers);
    }
}
