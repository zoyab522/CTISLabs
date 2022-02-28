/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prng;

import java.util.Random;

//Pseudo means not actually or totally random, but having the appearance of

public class PRNG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random randy = new Random(15);
        //we define the seed to be 15
        
        System.out.println(randy.nextInt());
        System.out.println(randy.nextInt());
        System.out.println(randy.nextInt());
        System.out.println(randy.nextInt());
        
        //note that nextInt() method generates a random integer
        //ranging from -2^31 to 2^31 - 1
        
        //with a specific seed, each program yields 
        //the same sequence of pseudo-random numbers
        
        randy.setSeed(50);
        System.out.println(randy.nextInt());
        System.out.println(randy.nextInt());
        System.out.println(randy.nextInt());
        System.out.println(randy.nextInt());
        
    }
    
}
