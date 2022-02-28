/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
 * PP3.1 - Page145
 */
package com.mycompany.usrnamegenerator;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author zoya
 */
public class UsrNameGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // This program generates a user name based on the user's first & last names;
        // Assume that the last name is at least 5 characters long.
        String first, last, username;
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Please enter your first name: ");
        first = scan.nextLine();
        System.out.println("Please enter your last name: ");
        last = scan.nextLine();

        username = first.charAt(0) + last.substring(0, 5) + (rand.nextInt(90) + 10);

        System.out.println("The generated username is: " + username);

    }

}
