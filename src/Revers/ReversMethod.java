package Revers;

public class ReversMethod {
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reversedArray[j] = array[i];
            j--;
        }
        return reversedArray;
    }
}
