package HW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введіть кількість балів:");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        a = scanner.nextInt();
        if (a <= 34) {
            System.out.println("Оцінка F");
        } else if (a >= 35 & a <= 59) {
            System.out.println("Оцінка FX");
        } else if (a >= 60 & a <= 63) {
            System.out.println("Оцінка E");
        } else if (a >= 64 & a <= 74) {
            System.out.println("Оцінка D");
        } else if (a >= 75 & a <= 81) {
            System.out.println("Оцінка C");
        } else if (a >= 82 & a <= 89) {
            System.out.println("Оцінка B");
        } else if (a >= 90 & a <= 100) {
            System.out.println("Оцінка A");
        }
    }
}