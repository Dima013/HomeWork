package Grade;

import java.util.TreeMap;

public class Grade_Calculator {
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
