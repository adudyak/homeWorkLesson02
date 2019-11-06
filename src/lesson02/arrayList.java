package lesson02;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> toSortList = new ArrayList<>();

        toSortList.add("Lorem");
        toSortList.add("ipsum");
        toSortList.add("dolor");
        toSortList.add("sit");
        toSortList.add("amet");
        toSortList.add("consectetur");

        System.out.print("Initial array: " + toSortList.toString());
        System.out.println();

        Collections.reverse(toSortList);
        System.out.print("Reverse order: " + toSortList.toString());
        System.out.println();
    }
}