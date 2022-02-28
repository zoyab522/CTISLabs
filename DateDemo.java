/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.datedemo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
// the ChronoUnit.between is useful when you want
// to measure the amount of time in a single unit only,
// such as days or hours or seconds

public class DateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate today = LocalDate.now();
        System.out.println("Our Current Date is: "
                + today);

        // add 2 months to the current date 
        LocalDate date2 = today.plus(1, ChronoUnit.MONTHS);

        long daysNegative = ChronoUnit.DAYS.between(date2, today);
        System.out.println("Days 'Negative' = " + daysNegative);

        long daysPositive = ChronoUnit.DAYS.between(today, date2);
        System.out.println("Dats 'Positive' = " + daysPositive);

        LocalDate dateBefore = LocalDate.of(2005, 03, 15);
        LocalDate dateAfter = LocalDate.now();
        
        long daysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        long MonthsBetween = ChronoUnit.MONTHS.between(dateBefore, dateAfter);
        long yearsBetween = ChronoUnit.YEARS.between(dateBefore, dateAfter);
        
        System.out.println("Days between: " + daysBetween);
        Period P = Period.between(dateBefore, dateAfter);
        
        System.out.println("Betweeen Period: " 
                + P.getYears() + " years, " 
                + P.getMonths() + " months, and " 
                + P.getDays() + " days");
        
        long p2 = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println("Between Period days: " + p2
                + " total days;");
        
        

    }

}
