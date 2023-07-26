package Cloneable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Read");
        hobbies.add("Football");
        User originalUser = new User(1, "Ivan Ivanov", hobbies);

        try {
            // Perform (shallow) cloning
            User shallowClone = (User) originalUser.clone();

            // Modify the hobbies list in the shallow clone
            shallowClone.getHobbies().add("Garden");

            System.out.println("Original clone" + " " + originalUser.getName() + " " + "Hobbies: " + " " + originalUser.getHobbies());
            System.out.println("Shallow clone " + " " + shallowClone.getName() + " " + "Hobbies" + " " + shallowClone.getHobbies());

            // Perform deep cloning
            User deepClone = (User) originalUser.clone();

            // Modify the hobbies list in the deep clone
            deepClone.getHobbies().add("Swimming");

            System.out.println("Original Cloneable.User: "+ " " + originalUser.getName() + " " + "Hobbies: " + originalUser.getHobbies());
            System.out.println("Deep Clone: "+ " " + deepClone.getName() + " " + " Hobbies: " + deepClone.getHobbies());


        } catch (CloneNotSupportedException mistake) {
            mistake.printStackTrace();
        }


    }


}
