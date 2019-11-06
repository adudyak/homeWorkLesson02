package lesson02;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Object> myHashMap = new HashMap<>();

        myHashMap.put("Test", 7);
        myHashMap.put("Class", 4.5);
        myHashMap.put("Cat", true);
        myHashMap.put("Dog", null);
        myHashMap.put("Bird", "Cat");
        myHashMap.put("Something", 83L);
        myHashMap.put("Mail", '8');
        myHashMap.put("Tab", '2');
        myHashMap.put("Browser", 22222222222L);
        myHashMap.put("IDE", (double) 489);

        myHashMap.forEach((key,value) -> System.out.println("key: " + key + " value:" + value));
    }
}
