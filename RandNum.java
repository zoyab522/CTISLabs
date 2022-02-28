
package com.mycompany.randnum;

import java.util.Random;

/**
 *
 * @author zoya
 */
public class RandNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Practice of Random numbers
        Random randGen = new Random();
        //New random number Generator
        
        System.out.println("Generating a random number" 
            + randGen.nextInt());
        System.out.println("Generating a second random number" 
            + randGen.nextInt());
        System.out.println("Generating a third random number" 
            + randGen.nextInt());
        System.out.println("Generating a fourth random number" 
            + randGen.nextInt());
        
        //generate a random number between 0 and 9
        System.out.println("generate a random number between 0 and 9: " +
            randGen.nextInt(10));
        System.out.println("generate a random number between 0 and 9: " +
            randGen.nextInt(10));
        System.out.println("generate a random number between 0 and 9: " +
            randGen.nextInt(10));
        
        //generate a random dice face value
        System.out.println("generate a random dice face value: " +
            (randGen.nextInt(6) + 1) );
        
        System.out.println("generate a random dice face value: " +
            (randGen.nextInt(6) + 1) );
        
        
        //generate a random number between -15 and 7
        System.out.println("generate a random number between -15 and 7: " +
            (randGen.nextInt(23) - 15) );
        
        //generate a random number between -50 and 50
        System.out.println("generate a random number between -50 and 50: " +
            (randGen.nextInt(101) - 50) );
        
        //generate a random number between -100 and 50
        System.out.println("generate a random number between -100 and 50: " +
            (randGen.nextInt(151) - 100) );
        
        //generate a random number between -20 and -10
        System.out.println("generate a random number between -20 and -10: " +
            (randGen.nextInt(11) - 20 ) );
        
        
        /*
        System.out.println("What will happen?" +
            randGen.nextInt(-10 )); //gives an error
                */
        
        System.out.println(Math.abs(randGen.nextInt() % 10));
        //abs is the absolute value 
        //Modulus gives an integer (the remainder of the division by that number)
        
    }
    
    }
    
