package org.launchcode.java.demos.lsn7interfaces;
import java.util.Comparator;
import java.lang.Double;
public class ConesComparator implements Comparator<Cone>{

    @Override
    public int compare(Cone o1, Cone o2){
        Double firstCost = o1.getCost();
        Double secondCost = o2.getCost();

        return java.lang.Double.compare(firstCost, secondCost);

    }
}
