package task;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> human  = Collections.singletonMap(
                "name",
                "Artur"
        );
        System.out.println(new Gson().toJson(human));
    }
}