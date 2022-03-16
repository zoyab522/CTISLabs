/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.priorityqueueexample;

import java.util.PriorityQueue;

/**
 *
 * @author zoya
 */
public class ProrityQueueExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Priority Queue of Integers
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        
        // Check if the Prority Queue is empty
        System.out.println("Is Priority Queue 'numbers' empty? : " + numbers.isEmpty());
        
        // Find the size of the PriorityQueue
        System.out.println("The size of the PriorityQueue is: " + numbers.size() + "\n");
        
        // Add items to Priority Queue
        numbers.add(300);
        numbers.add(750);
        numbers.add(500);
        numbers.add(650);
        numbers.add(550);
        numbers.add(900);
        numbers.add(450);
        numbers.add(150);
        
        // Check if the Prority Queue is empty
        System.out.println("Is Priority Queue 'numbers' empty? : " + numbers.isEmpty());
        
        // Find the size of the PriorityQueue
        System.out.println("The size of the PriorityQueue is: " + numbers.size() + "\n");
        
        System.out.println("PriorityQueue: " + numbers);
        
        // check if the PriorityQueue contains an element
        int num = 700; 
        if(numbers.contains(num)) {
            System.out.println("PriorityQueue 'numbers' contains " + num);
        } else {
            System.out.println("PriorityQueue 'numbers' does not contain " + num);
        }
        
        // remove items from PriorityQueue Dequeue()
        while(!numbers.isEmpty())
            System.out.println(numbers.remove());
        
    }
    
}
