package HW1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("введіть декілька цифр для реверсуу");
        Scanner scanner = new Scanner(System.in);
        int intscan = scanner.nextInt();
        reversN(intscan);
        }
           public static void reversN(int N){
        if (N<10){
            System.out.print(N);
            } else {
            System.out.print(N%10 + ",");
           reversN(N/10);
        }
             }





}
