package Bubble;

import java.util.Arrays;
import java.util.Random;

public class Array_Bubble {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Генеруємо випадкове число від 0 до 99
        }
        System.out.println("Starting array " + Arrays.toString(array));
        // Викликаємо функцію сортування бульбашкою для масиву
        bubbleSort(array);
        // Виводимо відсортований масив на консоль
        System.out.println("Sort     array " + Arrays.toString(array));

        long startTime = System.nanoTime();

// Основний код програми (вставка, сортування)
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Program execution time: " + duration + " nanoseconds");
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Міняємо місцями елементи
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Якщо не відбулося жодного обміну, то масив відсортований, виходимо з циклу
            if (!swapped) break;
        }

    }
}



