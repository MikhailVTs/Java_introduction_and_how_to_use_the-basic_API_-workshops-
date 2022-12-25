// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.Arrays;

public class task_3 {

    public void sort(int array[]) {
        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        for (int i = size - 1; i >= 0; i--) {

            int x = array[0];
            array[0] = array[i];
            array[i] = x;

            heapify(array, i, 0);
        }
    }

    void heapify(int array[], int heapSize, int i) {
        int largest = i;
        int leftChildIdx = 2 * i + 1;
        int rightChildIdx = 2 * i + 2;

        if (leftChildIdx < heapSize && array[leftChildIdx] > array[largest])
            largest = leftChildIdx;

        if (rightChildIdx < heapSize && array[rightChildIdx] > array[largest])
            largest = rightChildIdx;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, heapSize, largest);
        }
    }

    public static void main(String args[]) {
        int arrA[] = { 9, 10, 5, 3, 1, 2, 6 };

        System.out.println();
        System.out.println("Массив до пирамидальной сортировки: " + Arrays.toString(arrA));

        task_3 heapSort = new task_3();
        heapSort.sort(arrA);

        System.out.println();
        System.out.println("Массив после пирамидальной сортировки: " + Arrays.toString(arrA));

        System.out.println();
    }
}