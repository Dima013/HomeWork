package HomeWork.Sum;

import java.util.Arrays;
import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        boolean isExit;
        do {
            try {
                System.out.println("Enter the required size of the array : ");
                Scanner s = new Scanner(System.in);
                int size = s.nextInt();
                int numberFromCosole[] = new int[size];
                int sum = 0;
                System.out.println("Enter the elements of the array one by one ");

                for (int i = 0; i < size; i++) {
                    numberFromCosole[i] = s.nextInt();
                    sum += numberFromCosole[i];
                }
                System.out.println("Elements of the array are: " + Arrays.toString(numberFromCosole));
                System.out.println("Sum of the elements of the array :" + sum);

            } catch (Exception instead) {

                System.out.println("Wrong type" + instead.getMessage());
                System.out.println("Please try again");

            }
        } while (isExit = true);
    }
}

