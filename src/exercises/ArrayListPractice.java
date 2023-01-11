package exercises;

import org.launchcode.java.demos.lsn2controlflowandcollections.ArrayListGradebook;

import java.util.*;

public class ArrayListPractice {



    public static int evenInts(ArrayList<Integer> myList){
        int total = 0;
        for (int integer : myList){
            if(integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        {
            myList.add(1);
            myList.add(2);
            myList.add(18);
            myList.add(18);
            myList.add(19);
            myList.add(18);
            myList.add(15);
            myList.add(18);
            myList.add(18);
            myList.add(17);
        }
        System.out.println(evenInts(myList));
    }








    }
