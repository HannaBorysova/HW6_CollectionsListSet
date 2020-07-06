package main.java.com.hw6.collections;

import java.util.ArrayList;
import java.util.List;

public class ValueReplacing {
    public void replaceValue() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apricot");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Nectarine");
        fruits.add("Watermelon");
        int i = fruits.indexOf("Orange");
        if (i >= 0) {
            fruits.set(i, "Grapefruit");
        } else
            System.out.println("Value not present");
        System.out.println(fruits);
    }
}
