package main.java.com.hw6.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class DescendingSet {

    public Set<Integer> createSet() {
        Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(15);
        return treeSet;
    }

    public void sortElementsByDescend(Set<Integer> treeSet) {
        treeSet.addAll(treeSet);
        System.out.println("Sorted set by descend: " + treeSet);
    }
}
