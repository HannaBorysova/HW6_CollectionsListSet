package main.java.com.hw6.collections;

public class Executor {
    protected static void implementationCollections() {
        DivisibleRemoving divisibleRemoving = new DivisibleRemoving();
        divisibleRemoving.removeDivisibleNumbers(divisibleRemoving.createList());

        ValueReplacing orangeReplacing = new ValueReplacing();
        orangeReplacing.replaceValue(orangeReplacing.createList());

        DataComparison dataComparison = new DataComparison();
        dataComparison.checkSimilarElements(dataComparison.createFirstList(), dataComparison.createSecondList());

        DescendingSet descendingSet = new DescendingSet();
        descendingSet.sortElementsByDescend(descendingSet.createSet());
    }
}
