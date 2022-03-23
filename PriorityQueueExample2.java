package com.mycompany.priorityqueueexample2;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueExample2 {
    public static void main(String[] args) {
        PriorityQueue<String> namePriorityQueue =
                new PriorityQueue<>();
        
        PriorityQueue<String> nameSizePriorityQueue =
                new PriorityQueue<>(
                new Comparator<String>()
                {               
                    public int compare(String s1, String s2 )
                    {
                        return s1.length() - s2.length();
                    }            
                });
        
        
        //Add items (or names) to our namePriorityQueue
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Kevin");
        namePriorityQueue.add("Kelly");
        namePriorityQueue.add("Joe");
        namePriorityQueue.add("Nick");
        namePriorityQueue.add("Sofia");
        
        
        nameSizePriorityQueue.add("Lisa");
        nameSizePriorityQueue.add("John");
        nameSizePriorityQueue.add("Chris");
        nameSizePriorityQueue.add("Kevin");
        nameSizePriorityQueue.add("Kelly");
        nameSizePriorityQueue.add("Joe");
        nameSizePriorityQueue.add("Nick");
        nameSizePriorityQueue.add("Sofia");
        
        
        
        System.out.println("namePriorityQueue: "
                        + namePriorityQueue);
        System.out.println("nameSizePriorityQueue: "
                        + nameSizePriorityQueue);
        
        String temp = "";
        System.out.println("Using the Poll() on "
                + "the namePriorityQueue: ");
        while ((temp=namePriorityQueue.poll()) !=null)
            System.out.print( temp + "\t ");
        
        System.out.println("\nUsing the Poll() on "
                + "the nameSizePriorityQueue: ");
        while ((temp=nameSizePriorityQueue.poll()) !=null)
            System.out.print( temp + "\t ");
        
    }
    
    }
