/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.advancedlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author zoya
 */
public class ALLExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <String>LL = new LinkedList<String>();
        
        LL.add("Lionel Messi");
        LL.add("Neymar da Silva Sants Jr.");
        LL.add("Christiano Ronaldo");
        LL.add("Ronaldhino Gaucho");
        LL.add("Mohammed Salah");
        
        // Converting the LinkedList to Array
        String[] Soccer = LL.toArray(new String[LL.size()]);
        
        // Displaying the Array content
        System.out.println("Array Elements: ");
        for (int i = 0; i < Soccer.length; i++)
            System.out.println(Soccer[i]);
        
        List<String> SoccerPlayers = new ArrayList<String>(LL);
        System.out.println("\n\nArrayList Elements:");
        for(Object players : SoccerPlayers)
            System.out.println(players);
        
        LinkedList <String> LL1 = new LinkedList<String>();
        LL1.add("Kylian Mbappe");
        LL1.add("Zlatan Ibrahimovic");
        LL1.add("Luka Modric");
        
        System.out.println("LinkedList before sorting:" + LL);
        
        // Sorting LL with Collections.sort() method 
        Collections.sort(LL);
        System.out.println("Linked List after sorting: " + LL);

        System.out.println("LinkedList 1 before sorting: " + LL1);
      
        // Sorting LL with Collections.sort() method in natural
        Collections.sort(LL1);
        System.out.println("Linked List 1 after sorting: " + LL1);
        
    }
    
}
