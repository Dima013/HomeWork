package Cloneable;

import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable {
    private final int id;
    private final String name;
    private List<String> hobbies;

    public User(int id, String name, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Perform (shallow) cloning
        User clonedUser = (User) super.clone();

        // Perform deep cloning for the "hobbies" list
        List<String> clonedHobbies = new ArrayList<>();
        clonedHobbies.addAll(this.hobbies);
        clonedUser.setHobbies(clonedHobbies);

        return clonedUser;
    }

}
