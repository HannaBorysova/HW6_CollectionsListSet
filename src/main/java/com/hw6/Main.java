package main.java.com.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        removeDivisibleNumbers(list);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apricot");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Nectarine");
        fruits.add("Watermelon");

        replaceValue(fruits);
        checkSimilarElements();
        sortElementsByDescend();

    }

    private static void removeDivisibleNumbers(List<Integer> list) {
        list.removeIf(i -> i % 3 == 0);
        System.out.println("Whithout numbers divisible by 3: " + list);
    }

    private static void replaceValue(List<String> fruits) {
        int i = fruits.indexOf("Orange");
        if (i >= 0) {
            fruits.set(i, "Grapefruit");
        } else
            System.out.println("Value not present");

        System.out.println(fruits);
    }

    private static void checkSimilarElements() {
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

    private static void sortElementsByDescend() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(15);
        System.out.println("Sorted set by descend: " + treeSet.descendingSet());
    }
}
