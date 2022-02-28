/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.chapter5_pp5_7;

import java.util.Scanner;

public class RPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final int OPTIONS = 3;
        final int ROCK = 1, PAPER = 2, SCISSORS = 3;
        final int COMPUTER = 1, PLAYER = 2, TIE = 3;
        
        int computerChoice, playerChoice, winner = 0;
        int wins = 0, losses = 0, ties = 0;
        
        String again ;
        
        Scanner scanMe = new Scanner (System.in);
        
        again = "y";
        
        while (again.equalsIgnoreCase("y"))
        {
            computerChoice = (int)(Math.random()*OPTIONS)+1;
            
            System.out.println();
            System.out.println("Please enter your choice:\n\t"
                    + "1 for Rock\n\t"
                    + "2 for Paper\n\t"
                    + "3 for Scissors:");
            playerChoice = scanMe.nextInt();
            
            System.out.print("My choice was ");
            
            //determine the winner
            if(computerChoice == ROCK)
            {
                System.out.println("Rock");
                if(playerChoice == SCISSORS)
                    winner = COMPUTER;
                else
                    if (playerChoice == PAPER)
                        winner = PLAYER;
                    else
                        winner = TIE;
            }
            else if (computerChoice == PAPER)
            {
                System.out.println("Paper");
                if(playerChoice == ROCK)
                    winner = COMPUTER;
                else
                    if (playerChoice == SCISSORS)
                        winner = PLAYER;
                    else
                        winner = TIE;
            }
            else //computerChoice must be scissors
            {
                System.out.println("Scissors");
                if(playerChoice == PAPER)
                    winner = COMPUTER;
                else
                    if (playerChoice == ROCK)
                        winner = PLAYER;
                    else
                        winner = TIE;
            }
            
            //print the results and increment appropriate counter
            if (winner == COMPUTER)
            {
                System.out.println ("Computer Wins!");
                losses++;
            }
            else if (winner == PLAYER)
            {
                System.out.println ("You Win!");
                wins++;
            }
            else
            {
                System.out.println ("We are Tied");
                ties++;
            }
            
            System.out.println();
            System.out.println("Would you like to play again?");
            again = scanMe.next();
        }
        
        //print final results
        System.out.println("You Won " + wins + " times.");
        System.out.println("You lost " + losses + " times.");
        System.out.println("we tied " + ties + " times.");
    }
    
}
