/*
 * A Queue is a First-In-First-Out (FIFO) linear data structure
 * It models queues in real life, similar to the queues that you might have seen or been in at grocery stores or at the movies..
 * New elemenets in a queue are added at the back and removed from the front
 */
package com.mycompany.queueexample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author zoya
 */
public class QueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Queue<String> waitingQueue = new LinkedList<>(); // create and initialize a queue using a linkedlist

        // check if the queue is empty
        System.out.println("Is waitingQueue empty? " + waitingQueue.isEmpty());

        System.out.println("Size of waitingQueue is: " + waitingQueue.size() + "\n");

        // Adding new elements to the queue (the enqueue operation)
        System.out.println("Adding new elements to the queue (the enqueue operation): ");
        waitingQueue.add("Kevin");
        waitingQueue.add("Chris");
        waitingQueue.add("John");
        waitingQueue.add("Lisa");
        waitingQueue.add("Jalen");
        waitingQueue.add("Mark");
        waitingQueue.add("Sofia");
        waitingQueue.add("Anna");
        waitingQueue.add("Steve");
        waitingQueue.add("Emily");

        System.out.println("waitingQueue: " + waitingQueue);

        // check if the queue is empty
        System.out.println("Is waitingQueue empty? " + waitingQueue.isEmpty());
        System.out.println("Size of waitingQueue is: " + waitingQueue.size() + "\n");
        
        // Removing an element from the queue using remove()
        // The dequeue operation
        // the remove method throws NoSuchElementException if the queue is empty
        
        String name = waitingQueue.remove();
        
        System.out.println("Remove from waitingQueue: " + name + "\nNew waitingqueue: " 
                + waitingQueue);
        
        // Removing an element from the queue using poll()
        // the poll() method is similar to the removie() method
        // except that it returns null if the queue is empty
        
        name = waitingQueue.poll();
        System.out.println("Remove from waitingQueue: " + name + "\nNew waitingqueue: " 
                + waitingQueue);
        
        // get the first element (element at the front) of the queue without removing it using element() method
        // the element method throws NoSuchElementException if the queue is empty
        
        String firstPersonInTheWaitingQueue = waitingQueue.element();
        System.out.println("First person in the Waiting Queue using the element() method is: " 
                + firstPersonInTheWaitingQueue);
        
        // get the first element (element at the front) of the queue without removing it using peek() method
        // the peek method is similar to the element method, except that it returns null if the queue is empty
        
        firstPersonInTheWaitingQueue = waitingQueue.peek();
        System.out.println("First person in the Waiting Queue using the peek() method is: " 
                + firstPersonInTheWaitingQueue);
        
        //----------------------------------------------------------------------
        System.out.println("===Iterating over a queue using Java8 forEach() ===");
        waitingQueue.forEach((name2->{System.out.println(name2);}));
        
        System.out.println();
        
        System.out.println("=== Iterating over a queue using iterator()===");
        
        Iterator<String> waitingQueueIterator = waitingQueue.iterator();
        
        while(waitingQueueIterator.hasNext()) {
            String name3 = waitingQueueIterator.next();
            System.out.print(name3 + ", ");   
        }  
        
        System.out.println();
        
        System.out.println();
        
        System.out.println("=== Iterating over a queue using a simple for-each loop ===");
        
        for(String name5: waitingQueue) 
            System.out.println(name5);
    }

}
