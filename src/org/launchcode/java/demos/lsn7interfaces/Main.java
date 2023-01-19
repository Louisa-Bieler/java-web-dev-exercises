package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        FlavorComparator compare = new FlavorComparator();
        ConesComparator coneCompare = new ConesComparator();
        System.out.println(flavors.toString());
        System.out.println(cones.toString());

        flavors.sort(compare);
        cones.sort(coneCompare);


        System.out.println(flavors.toString());
        System.out.println(cones.toString());
    }
}
