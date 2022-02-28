/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.strops;

/**
 *
 * @author zoya
 */
public class StrOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // This is a practice for string operations
        
        String greeting = "HelloCTIS310"; 
        System.out.println("The length of the greeting string is: " +
                greeting.length());
        System.out.println("the character at index 8 is: " + greeting.charAt(8));
        
        String PartialGreeting = greeting.substring(5, 9);
        System.out.println("The PartialGreeting string is: " +
                PartialGreeting);
        System.out.println("The length of the PartialGreeting string is: " +
                PartialGreeting.length());
        
        System.out.println("Changing all the characters to upper case: " +
            greeting.toUpperCase());
        System.out.println("Changing all the characters to lower case: " +
            greeting.toLowerCase());
        
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         System.out.println("The length of the Alphabet string is: " +
                Alphabet.length());
         
         String txt = "Please locate where 'locate' occurs!";
         System.out.println("The index of locate in the text is:" 
                 + txt.indexOf("locate")); //output?
         
         
         String CourseNumber = "CTIS 310";
         String CourseName = "Advanced Java PRogramming";
         
         System.out.println("Using the concatenation operator:");
         System.out.println(CourseNumber + CourseName);
         System.out.println("Concatenating 3 string: " + 
                 CourseNumber + " - " + CourseName);
         
         System.out.println("Dealing with Special Characters");
         String OK = "It\'s alright!";
         System.out.println("This is the String \" OK \" " + OK);
         
         System.out.println("This String \" OK \" hashcode is: " + 
                 OK.hashCode());
         String OK1 = "It\'s alright!1";
         System.out.println("This String \" OK1 \" hashcode is: " + 
                 OK1.hashCode());
         
         System.out.println("Use replace method 1 on the string \"OK\": "
            + OK.replace("al", "ALL"));
         System.out.println("Use replace method 2 on the string \"OK\": "
            + OK.replace('r', 'w'));
    }
    
}
