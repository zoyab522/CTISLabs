/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sve1;

/**
 *
 * @author zoya
 * A static variable is common to all the instances or objects of the class because it is a class level variable
 * A single copy of the static variable is created and share among all the instances of the class
 * Memory allocation for such variables only happens once when the class is loaded in the memory
 * Like variables, we can have static block, static method, and static class
 */
public class SVE1Class {
    
    static int count = 0; //count is a static variable
    public void increment()
    {
        System.out.println("\nInside the public void incremement() menod:");
        System.out.println("The increment() method incrememnts the static int " 
                + "count variable: ");
        
        count++; //count = count + 1;
        
    }
    
    public static final int MU_STATIC_VARIABLE = 27;
    //THIS STATIC VARIABLE IS A CONSTANT
    //Note that final variables always needs to be initialized
    //MU_STATIC_VARIABLE is public which means any class can use it
    // It is a static variable so you won't need any object of class
    //in order to access it
    // it is also final so the value of this varibale can never be changed in
    // the current or in any class
    
    static int num;
    static String myStr;
    
    static {
        //My first static block
        System.out.println("\nInside of my first static block:");
        num = 17;
        myStr = "Block 1 static keyword in Java";
        //Note that both these static variables were initialized
        //before we accessed them in the main method
        System.out.println(" Block 1 num: " + num);
        System.out.println(" Block 1 myStr: " + myStr);
    }
    
    static { //My second static block
        System.out.println("\nInside of my second static block: ");
        num = 29;
        myStr = "Block 2 static keyword in Java";
        System.out.println(" Block 2 num: " + num);
        System.out.println(" Block 2 myStr: " + myStr);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // note that main is also a static method
        
        SVE1Class object1 = new SVE1Class();
        SVE1Class object2 = new SVE1Class();
        
        object1.increment();
        object2.increment();
        
        System.out.println("Object1 count is: " + object1.count);
        System.out.println("Object2 count is: " + object2.count);
        
        object1.count = 10;
        System.out.println("Object1 count is: " + object1.count);
        object2.count = 20;
        System.out.println("Object1 count is: " + object2.count);
        
        System.out.println("Value of num: " + num);
        System.out.println("Value of myStr: " + myStr);
        
    }
    
}
