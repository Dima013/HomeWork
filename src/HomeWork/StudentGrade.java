package HomeWork;

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

                String grade = determineGrade(gradeMap, score);
                System.out.println("Student's grade: " + grade);
            } catch (Exception mistake) {
                System.out.println("Wrong type" + mistake.getMessage());
            }
        } while (isExit = true);
    }


    public static String determineGrade(TreeMap<Integer, String> gradeMap, int score) {
        // Перебераємо записи TreeMap у зворотньому порядку за допомогою descendingMap()
        for (var entry : gradeMap.descendingMap().entrySet()) {
            if (score >= entry.getKey()) {
                return entry.getValue();
            }
        }
        return "F";
    }

}
