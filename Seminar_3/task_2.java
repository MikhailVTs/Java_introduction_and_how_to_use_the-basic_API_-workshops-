import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

// 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

/**
 * task_2
 */
public class task_2 {

    public static void main(String[] args) throws IOException {

        int[] array = {4, 6, 1, 5, 9, 26, 15, 44, 98, 3, 9, 56, 23, 74, 8};

        System.out.println();    
        System.out.println("Произвольный список целых чисел " + Arrays.toString(array));
        System.out.println();  

        ArrayList<Integer> list = new ArrayList<Integer> ();

        for (int i = 0; i < array.length; i++) list.add(array[i]);


        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 != 0) 
                odd.add(x);
        }

        System.out.println();    
        System.out.println("Список без четных целых чисел " + odd);
        System.out.println(); 
    }  
}