package Bubble;

import java.util.Arrays;
import java.util.Random;

public class Array_Bubble_Insert {

    public static void main(String[] args) {
        int[] anotherArray = new int[10];
        Random random = new Random();
        // Вставка 10 випадкових елементів у масив
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = random.nextInt(100);
        }
        System.out.println("Starting array " + Arrays.toString(anotherArray));
        insertSort(anotherArray);
        System.out.println("Sort     array (with insert) " + Arrays.toString(anotherArray));

    }

    // Сортування масиву за допомогою сортування вставкою (insert sort)
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }
}
