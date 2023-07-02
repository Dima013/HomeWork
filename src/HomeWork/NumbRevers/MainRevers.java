package HomeWork.NumbRevers;

import java.util.Scanner;

public class MainRevers {
    public static void main(String[] args) {
        boolean miss = false;
        do {
            try {
                ReversMethod reversMethod = new ReversMethod();
                System.out.print("Enter the number that you want to reverse: ");
                Scanner sc = new Scanner(System.in);
                int a = reversMethod.RReversMethod(sc.nextInt());
                System.out.println("The reverse of the given number is: " + a);
                miss = false;
            } catch (Exception mistake) {
                miss = true;
                System.out.println("Wrong type" + mistake.getMessage());
            }
        }
        while (miss);
    }
}

