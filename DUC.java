/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.daysuntilchristmas;

import java.util.*;


/**
 *
 * @author zoya
 */
public class DUC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, 11); // 11 = december
        c.set(Calendar.DAY_OF_MONTH, 25);
        
        Date xmas = c.getTime();
        Date today = new Date();
        
        long diff = xmas.getTime() - today.getTime();
        
        diff = diff / (1000L * 60L * 60L * 24L); // L is for Long
        
        System.out.println("Days until Christmas: " +  diff);
        
        
    }
    
}
