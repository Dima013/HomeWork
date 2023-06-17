package HW1;


import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vvedennya  = "0.0";
        double suma = 0, chyslo = 0;
        while (vvedennya.equals(".")!=true){
            chyslo = Double.parseDouble(vvedennya);
            suma = suma + chyslo;
            System.out.println("введіть число або [.] щоб зупинитись ");
            vvedennya = scanner.nextLine();
          }
        System.out.println("Сума введених чисел = "+" "+suma);

    }
}



