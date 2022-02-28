/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author zoya
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare and initialize an array with 4 integer elements
        int[] testScores = {99, 85, 43, 97};
        // Declare and don't intialize so what's in these elements?
        int[] testScoresOther = new int[4];
        System.out.println("First test array: " + testScores);
        System.out.println("Second test array: " + testScoresOther);
        System.out.println("First test array: " + Arrays.toString(testScores));
        System.out.println("First test array: " + Arrays.toString(testScoresOther));

        // Use a loop to fill an array
        Random rand;
        rand = new Random();
        for (int i = 0; i < testScoresOther.length; i++) {
            testScoresOther[i] = rand.nextInt(101);
        }
        
        // let's try to copy an array
        int[] testScoresCopy = testScores;
        // and make a change => we just copied the reference to testScores, 
        // and not the actual data
        testScoresCopy [0] = 100;
        // let's make a copy with the data
        int[] testScoresDeeperCopy = Arrays.copyOf(testScores, testScores.length); 
        
    }

}
