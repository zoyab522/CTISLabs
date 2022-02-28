/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.randstr;

public class RandStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Choose a random character from this STring
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789";
        
        String RandString = "";
        
        int size = 10;
        
        for (int i = 0; i < size; i++){
            //generate a random number between 0 and AlphanumericString length
            int index = (int)(AlphaNumericString.length()*Math.random());
            //add character one by one 
            RandString = RandString + AlphaNumericString.charAt(index);
        }
    
        System.out.println("The random generated String of size 10: "
            + RandString + "\n The size of our random generated string is: "
            + RandString.length());

    }
    
}
