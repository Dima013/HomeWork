package Grade;

import java.util.Scanner;
import java.util.TreeMap;

public class StudentGrade {
    public static void main(String[] args) {
        boolean isExit;
        do {
            try {
                TreeMap<Integer, String> gradeMap = new TreeMap<>();
                gradeMap.put(90, "A");
                gradeMap.put(80, "B");
                gradeMap.put(70, "C");
                gradeMap.put(60, "D");
                gradeMap.put(0, "E");

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the student's score: ");
                int score = scanner.nextInt();

                if (score < 0 || score > 100){
                    throw new IllegalArgumentException("Wrong number, please 0-100");
                }

                String grade = gradeMap.floorEntry(score).getValue();
                System.out.println("Student's grade: " + grade);

                System.out.println("Would you like to continue?  Yes -1, No - 0");
                int choice = scanner.nextInt();
            } catch (Exception instead ) {
                System.out.println("Wrong type" + instead.getMessage());
            }
        } while (isExit=true);
    }
    }
