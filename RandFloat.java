/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.randfloat;

import java.util.Random;

/**
 *
 * @author zoya
 */
public class RandFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random generator = new Random();
        
        int num1;
        float num2;
        
        num2 = generator.nextFloat();
        System.out.println("A randm number between (0 - 1): " + num2);
        
        //0.0 up to 7.999999
        
        num2 = generator.nextFloat()*8;
        System.out.println("A randm number between (0 - 8): " + num2);
        
        
        num1 = (int)num2 + 1;
        System.out.println("A randm number between (1 - 8): " + num1);
    }
    
}
