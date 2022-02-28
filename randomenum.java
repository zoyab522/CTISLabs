/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.randenum;

/**
 *
 * @author zoya
 */
public class randomenum {
    
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        
        public static Day getRandom () {
            return values()[(int)(Math.random()*values().length)];
            
        }
        public static void main(String[] args) {
            System.out.println("This is a random day of the week: " 
            + Day.getRandom());
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
