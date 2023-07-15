import java.util.Scanner;

public class MainRevers {
    public static void main(String[] args) {
        boolean isExit;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введіть кількість цифр яку реверснемо: ");
                int count = scanner.nextInt();

                int[] numbers = new int[count];
                System.out.println("Введіть цифри:");
                for (int i = 0; i < count; i++) {
                    numbers[i] = scanner.nextInt();
                }

                int[] reversedNumbers = reverseArray(numbers);
                System.out.println("Результат:");
                for (int number : reversedNumbers) {
                    System.out.print(number + " ");
                }
            } catch (Exception mistake) {
                System.out.println("Wrong type" + mistake.getMessage());
                System.out.println("Please try again");
            }
        } while (isExit = true);
    }



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

