package task;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        User user = new User("Artur", "Abramian");
        System.out.println(new Gson().toJson(user));
    }
}