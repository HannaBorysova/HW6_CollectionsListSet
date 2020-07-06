package main.java.com.hw6.collections;

import java.util.ArrayList;
import java.util.List;

public class DataComparison {
    public void checkSimilarElements() {
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(5);
        first.add(8);

        List<Integer> second = new ArrayList<>();
        second.add(7);
        second.add(8);
        second.add(9);

        first.retainAll(second);
        System.out.println("Similar elements: " + first);
    }
}
