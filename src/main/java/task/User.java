package task;

public class User {
    private String name;
    private String lastName;

    public User() {
        this.name = "Admin";
        this.lastName = "Admin";
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
