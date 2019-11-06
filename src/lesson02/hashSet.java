package lesson02;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();
        LinkedList<String> myLinkedList = new LinkedList<>();

        myHashSet.add("pineapple");
        myHashSet.add("watermelon");
        myHashSet.add("apple");
        myHashSet.add("pear");
        myHashSet.add("quince");
        myHashSet.add("lemon");
        myHashSet.add("kiwi");

        myLinkedList.add("plum");
        myLinkedList.add("nut");
        myLinkedList.add("apple");
        myLinkedList.add("grape");
        myLinkedList.add("peach");
        myLinkedList.add("pear");
        myLinkedList.add("cherry");
        myLinkedList.add("orange");
        myLinkedList.add("watermelon");
        myLinkedList.add("apricot");
        myLinkedList.add("pineapple");

        System.out.println("Initial set: " + myHashSet.toString());

        for (Iterator<String> iterator = myHashSet.iterator(); iterator.hasNext(); ) {
            String string = iterator.next();
            System.out.println("Item: " + string + ". Exists in list: " + myLinkedList.contains(string));
            if (!myLinkedList.contains(string)) iterator.remove();
        }

        System.out.println("Revised set: " + myHashSet.toString());
    }
}
