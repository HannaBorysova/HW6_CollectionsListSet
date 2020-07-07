package main.java.com.hw6.collections;

import java.util.TreeSet;

public class DescendingSet {
    TreeSet<Integer> createSet(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(15);
        return treeSet;
    }

    public void sortElementsByDescend(TreeSet<Integer> treeSet) {
        System.out.println("Sorted set by descend: " + treeSet.descendingSet());
    }
}
