// 2. Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Arrays;

public class task_2 {
    public static void sort_bubble(int[] sort_array) {
        for (int i = 0; i < sort_array.length - 1; i++) {
            for (int j = 0; j < sort_array.length - i - 1; j++) {
                if (sort_array[j + 1] < sort_array[j]) {
                    int swap = sort_array[j];
                    sort_array[j] = sort_array[j + 1];
                    sort_array[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        Logger logger = Logger.getLogger(task_2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int iteration = 1;
        int[] sort_array = { 156, 35, 12, 98, 3, 72 };
        System.out.println();
        System.out.println("До пузырьковой сортировки");
        System.out.println(Arrays.toString(sort_array));
        System.out.println();
        sort_bubble(sort_array);

        for (int i = 0; i < sort_array.length; i++) {
            logger.info("Итерация " + iteration++);
        }
        
        System.out.println();
        System.out.println("После пузырьковой сортировки");
        System.out.println(Arrays.toString(sort_array));
        System.out.println();
    }
}