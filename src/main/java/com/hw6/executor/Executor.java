package main.java.com.hw6.executor;

import main.java.com.hw6.collections.DataComparison;
import main.java.com.hw6.collections.DescendingSet;
import main.java.com.hw6.collections.DivisibleRemoving;
import main.java.com.hw6.collections.ValueReplacing;


public class Executor {
    public static void implementCollections() {
        DivisibleRemoving divisibleRemoving = new DivisibleRemoving();
        divisibleRemoving.removeDivisibleNumbers(divisibleRemoving.createList(), 3);

        ValueReplacing orangeReplacing = new ValueReplacing();
        orangeReplacing.replaceValue(orangeReplacing.createList());

        DataComparison dataComparison = new DataComparison();
        dataComparison.checkSimilarElements(dataComparison.createFirstList(), dataComparison.createSecondList());

        DescendingSet descendingSet = new DescendingSet();
        descendingSet.sortElementsByDescend(descendingSet.createSet());
    }
}
