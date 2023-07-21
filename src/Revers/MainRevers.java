package Revers;

import java.util.Scanner;

public class MainRevers {
    public static void main(String[] args) {
        boolean isExit;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of digits to reverse: ");
                int count = scanner.nextInt();

                int[] numbers = new int[count];
                System.out.println("Enter numbers:");
                for (int i = 0; i < count; i++) {
                    numbers[i] = scanner.nextInt();
                }

                int[] reversedNumbers = ReversMethod.reverseArray(numbers);
                System.out.println("Result:");
                for (int number : reversedNumbers) {
                    System.out.print(number + " ");
                }
            } catch (Exception instead) {
                System.out.println("Wrong type" + instead.getMessage());
                System.out.println("Please try again");
            }
        } while (isExit = true);
    }


}

