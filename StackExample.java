package com.mycompany.stackexample1;

import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author zoya
 * A Stack is a linear data structure that is used to store a collection of objects
 * A Stack is based on Last-In-First-Out (LIFO) or could be First-In-Last-Out (FILO)
 * Java collection framework provides many interfaces and classes to store the collection of objects
 * 
 * 1 - Create a Stack
 * 2 - Perform Push and Pop operation in a stack
 * 3 - Check if Stack is empty
 * 4 - Find the state of a stack
 * 5 - Search for an element in the stack
 */
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stackOfCards = new Stack<>();
        
        // Check if the Stack is empty
        System.out.println("Is the stack empty? : " + stackOfCards.isEmpty());
        
        // Find the size of the stack
        System.out.println("Size of the Stack: " + stackOfCards.size());
        
        // Pushing new elements to the Stack (adding elements)
        System.out.println("Pushing new elements to the Stack: ");
        stackOfCards.push("Jack of Hearts");
        stackOfCards.push("Queen of Spades");
        stackOfCards.push("Ace of Clubs");
        stackOfCards.push("Nine of Hearts");
        stackOfCards.push("Five of Diamonds");
        stackOfCards.push("Jack of Diamonds");
        stackOfCards.push("Joker");
        
        System.out.println("Stack : " + stackOfCards);
        
        System.out.println(); // j adding whitespace
        
        // Check if the Stack is empty
        System.out.println("Is the stack empty? : " + stackOfCards.isEmpty());
        
        // Find the size of the stack
        System.out.println("Size of the Stack: " + stackOfCards.size());
        
        // Popping Items from the Stack
        String cardAtTop = stackOfCards.pop();
        // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() :: " + cardAtTop);
        System.out.println("Current Stack: " + stackOfCards);
        
        System.out.println();
        
        // Get the item or element at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Current Stack: " + stackOfCards);
        
        System.out.println();
        
        // Search for an element
        // The search method returns based position of the element from the top of the Stack 
        // Returns -1 if the element was not found in the Stack
        
        System.out.println("\n Search for an element in the Stack");
        int position = stackOfCards.search("Queen of Spades");
        if (position != -1) 
            System.out.println("Found the searched element 'Queen of Spades' "
                    + "at position: " + position);
        else
            System.out.println("Element 'Queen of Spades' not found");
        
        // ---------------------------------------------------------------------
        
        System.out.println("\n Search for an element in the Stack");        
        int position1 = stackOfCards.search("Queen of Hearts");
        if (position1 != -1) 
            System.out.println("Found the searched element 'Queen of Hearts' "
                    + "at position: " + position1);
        else
            System.out.println("Element 'Queen of Hearts' not found");
        
        System.out.println("======== Iterate over a stack  using Java 8 forEach() method ========");
        stackOfCards.forEach(card-> {System.out.println(card);});
        
        System.out.println("======== Iterate over a stack  using Iterator() method ========"); 
        Iterator<String> cardIterator = stackOfCards.iterator();
        
        while(cardIterator.hasNext()) {
            
            String Card1 = cardIterator.next();
            System.out.println(Card1);
        }
        
        System.out.println("======== Iterate over a stack from TOP to BOTTOM using listIterator() ========"); 
        // listIterator allows you to traverse in both forward and backward directions
        // We'll start from the top of the stack and traverse backwards
        
        ListIterator<String> cardListIterator = stackOfCards.listIterator(stackOfCards.size());
        
        while(cardListIterator.hasPrevious()) {
            String Card2 = cardListIterator.previous();
            System.out.println(Card2);
        }
        
        System.out.println("Reversing the Stack using a Clone Stack.");
        // Create another stack copy
        Stack stackR = (Stack)stackOfCards.clone();
        Stack stackReverse = new Stack<>();
        
        for (int i = 0; i < stackOfCards.size(); i++) {
            // Popping items from the Stack
            Object cardAtTopR = stackR.pop();
            // Throws EmptyStackException if the stack is empty
            System.out.println("StackR.pop() :: " + cardAtTopR);
            stackReverse.push(cardAtTopR);
            System.out.println("Reverse Stack :: " + stackReverse);       
        }
        
        //cardIterator = stackOfCards.iterator();
    }
    
}
