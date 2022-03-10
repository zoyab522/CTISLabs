/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.linkedlistsexample1;

import java.util.LinkedList;

/**
 *
 * @author zoya
 */
public class LLE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LL declaration
        LinkedList<String> myLinkedList
                = new LinkedList<String>();

        //Add elements to the LL
        myLinkedList.add("Item1");
        myLinkedList.add("Item2");
        myLinkedList.add("Item3");
        myLinkedList.add("Item4");
        myLinkedList.add("Item5");
        myLinkedList.add("Item6");
        myLinkedList.add("Item7");

        //Display LL Content
        System.out.println("Item's Linked List Content:\n"
                + myLinkedList);
        System.out.println("Item's Linked List size:\n"
                + myLinkedList.size() + "\n");

        //Add first and last elements
        myLinkedList.addFirst("Item0");
        myLinkedList.addLast("Item10");
        myLinkedList.add(3, "Item?");

        //Display LL Content
        System.out.println("Item's Linked List Content:\n"
                + myLinkedList);
        System.out.println("Item's Linked List size:\n"
                + myLinkedList.size() + "\n");

        //Getting and setting values
        Object firstVar = myLinkedList.get(0);
        System.out.println("First Element in Linked List: "
                + firstVar);
        myLinkedList.set(0, "Changed 1st Item");

        Object firstVar0 = myLinkedList.get(0);
        System.out.println("My new First Element in "
                + "Linked List: " + firstVar0);

        //Display LL Content
        System.out.println("Item's Linked List Content:\n"
                + myLinkedList);
        System.out.println("Item's Linked List size:\n"
                + myLinkedList.size() + "\n");

        //Remove 1st & remove last
        myLinkedList.removeFirst();
        myLinkedList.removeLast();
        System.out.println("My LL after removing 1st "
                + "and last elements:\n"
                + myLinkedList);
        System.out.println("Item's Linked List size:\n"
                + myLinkedList.size() + "\n");

        //removing different elements
        System.out.println("Removing the first occurance"
                + " of 'item6' from the list: ");
        myLinkedList.removeFirstOccurrence("item6");
        System.out.println("Linked List Content after"
                + " modification:\n"
                + myLinkedList + "\n");
        System.out.println("Removing the last occurance"
                + " of 'item3' from the list: ");
        myLinkedList.removeLastOccurrence("item3");
        System.out.println("Linked List Content after"
                + " modification:\n"
                + myLinkedList + "\n");

        //Add to a position and remove from a position
        myLinkedList.add(0, "Newly Added Item");
        System.out.println("Linked List Content after"
                + " modification:\n"
                + myLinkedList + "\n");
        myLinkedList.remove(2);
        System.out.println("Linked List Content after"
                + " removing item at index 2:\n"
                + myLinkedList + "\n");

        boolean var = myLinkedList.contains("Item4");
        System.out.println("Does myLinkedList "
                + "contain 'Item4'?" + var + "\n");

        myLinkedList.remove("Item?");

        Object str = myLinkedList.clone(); //returns the copy
        // of the linked list

        System.out.println("The cloned Linked List is: \n"
                + str);

        myLinkedList.clear();
        //removes al the elements of the list
        System.out.println("myLinkedList Content after "
                + "being cleared is: \n"
                + myLinkedList + "\n");

    }

}
