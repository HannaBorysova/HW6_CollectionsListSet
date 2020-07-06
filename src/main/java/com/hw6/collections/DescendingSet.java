package main.java.com.hw6.collections;

import java.util.TreeSet;

public class DescendingSet {
    public void sortElementsByDescend() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(15);
        System.out.println("Sorted set by descend: " + treeSet.descendingSet());
    }
}
