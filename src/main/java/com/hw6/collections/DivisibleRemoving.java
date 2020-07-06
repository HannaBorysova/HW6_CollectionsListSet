package main.java.com.hw6.collections;

import java.util.ArrayList;
import java.util.List;

public class DivisibleRemoving {
    public void removeDivisibleNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);
        list.removeIf(i -> i % 3 == 0);
        System.out.println("Whithout numbers divisible by 3: " + list);
    }
}
