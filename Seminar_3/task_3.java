import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 3. Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка. 
// Формат сдачи: 
// файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.

/**
 * task_3
 */
public class task_3 {

    public static void main(String[] args) throws IOException {

        int[] array = {4, 6, 1, 5,  26, 15, 44, 98, 3, 56, 23, 74, 45, 3, 88};

        System.out.println();    
        System.out.println("Произвольный список целых чисел " + Arrays.toString(array));
        System.out.println();  

        ArrayList<Integer> list = new ArrayList<Integer> ();

        for (int i = 0; i < array.length; i++) list.add(array[i]);

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i: list) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        
        Collections.sort(list);
        
        int mid = list.get((list.size() / 2) - 1);

        System.out.println("минимальное число: " + min);
        System.out.println("среднее число: " + mid);
        System.out.println("максимальное число: " + max);
 
    }  
}