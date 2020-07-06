package main.java.com.hw6;

import main.java.com.hw6.collections.DataComparison;
import main.java.com.hw6.collections.DescendingSet;
import main.java.com.hw6.collections.DivisibleRemoving;
import main.java.com.hw6.collections.ValueReplacing;


public class Main {

    public static void main(String[] args) {
        DivisibleRemoving divisibleRemoving = new DivisibleRemoving();
        divisibleRemoving.removeDivisibleNumbers();

        ValueReplacing orangeReplacing = new ValueReplacing();
        orangeReplacing.replaceValue();

        DataComparison dataComparison = new DataComparison();
        dataComparison.checkSimilarElements();

        DescendingSet descendingSet = new DescendingSet();
        descendingSet.sortElementsByDescend();
    }
}
