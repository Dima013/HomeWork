package HomeWork.Sum;

import HomeWork.NumbRevers.ReversMethod;

import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        boolean miss = false;
        System.out.print("Enter the numbers that you want to sum: ");
        int sum =0;
        int numbers = 0;

        do {
            Scanner sc = new Scanner(System.in);
            numbers = sc.nextInt();
            sum+= numbers;

            }while (numbers!=0);
            try {
                System.out.println("Sum" + sum);



            } catch (Exception mistake) {
                miss = true;
                System.out.println("Wrong type" + mistake.getMessage());
            }

        while (miss);
    }
}

