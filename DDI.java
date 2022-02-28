/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mp2_daydateinfo_zoyab;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author zoya
 */
public class DDI {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int yearInput;
        int monthInput;
        //String monthInput;
        int dateInput;
        //int monthNo;
        
        /**
         * Originally, I wrote this so that the user could also input a 
         * String for the month (like "March") and the program would take the 
         * input, and convert it to an integer out of twelve (so it would 
         * convert "March" to 3)
         * I have now slightly altered the program so that the user can only
         * enter an integer for the month (they cannot write March, only the 
         * number '3')
         */

        // GET USER INPUTS FOR THE DATE
        
        System.out.println("Please enter the date to know the day and to print "
                + "that month's calendar: \n");
        System.out.println("Enter year: "); // ask the user to enter the year
        yearInput = scanner.nextInt();
        System.out.println("Enter month: "); // ask the user to enter the month
        monthInput = scanner.nextInt();
        System.out.println("Enter date: "); // ask user for day of the month
        dateInput = scanner.nextInt();

        // Convert the String input of the month to an integer out of twelve
        //monthNo = Month.valueOf(monthInput.toUpperCase()).getValue();

        // Check if its a leap year using LocalDate and an if/else statement
        LocalDate localYear = LocalDate.of(yearInput, monthInput, dateInput);

        if (localYear.isLeapYear()) { // print if
            System.out.println(yearInput + " is a leap year.");
        } else {
            System.out.println(yearInput + " is not a leap year.");
        }

        // Format the date
        DateTimeFormatter localDate = DateTimeFormatter.ofPattern("MM/dd/yy");
        String dateFormat = localYear.format(localDate);
       
        // Find and print out the day of the week
        DayOfWeek weekDay = DayOfWeek.from(localYear);
        System.out.println(dateFormat + " was a " + weekDay.name());
        
        // Find the number of the days in the month
        Calendar calendar; 
        // 0 - Jan --> use monthNo - 1
        calendar = new GregorianCalendar(yearInput, monthInput - 1, dateInput); 
        
        int daysOfMonth;
        daysOfMonth= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        
        // PRINT number of days in month
        System.out.println("The month " + Month.of(monthInput).name() 
                + " has " + daysOfMonth + " days.");
         
        // SET UP THE VISUAL CALENDAR
        
        // Set the first day of the month to 1 using the following line: 
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        
        // this line will come in handy later
        int day = calendar.get(Calendar.DAY_OF_WEEK); 
        
        // Print the days of the week       
        String SDF; 
        SDF = new SimpleDateFormat("MMMM YYYY").format(calendar.getTime());
        System.out.println("The calendar for " + SDF);
        System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa");
        
        // Formatting the calendar 
        String Space = "";
        for (int i = 0; i < day - 1; i++) { // this is where line 76 is useful
            Space += "    ";
        }
        
        System.out.print(Space);
        
        // Print the rest of the numbers (the days) of the calendar
        for (int i = 0, dayOfMonth = 1; dayOfMonth <= daysOfMonth; i++) {
            for (int j = ((i == 0) ? day - 1 : 0); j < 7 && 
                    (dayOfMonth <= daysOfMonth); j++) {
                System.out.printf("%3d ", dayOfMonth);
                dayOfMonth++;
            }
            
            System.out.println();   
        }
        
        System.out.println(); // add more whitespace 
        
        // DATE ENTERED + CURRENT DATE AND TIME
        
        System.out.println("The date entered is:\t       " + dateFormat);        
        Calendar localCalendar = Calendar.getInstance();
        SimpleDateFormat SDF2 = new SimpleDateFormat("MM/dd/YYYY" 
                + " hh:mm:ss a");
        String todayTime = SDF2.format(localCalendar.getTime());
        System.out.println("Today's current date and time: " + todayTime);
        
        /**
         * Here, I will use ChronoUnit to find the difference between the days
         * If the diff is greater than 0, the input is before the current date
         * If it is less than 0, then the date entered is after the current date
         */
        
        LocalDate LocalDateNow = LocalDate.now();
        
        long diff = ChronoUnit.DAYS.between(localYear, LocalDateNow);
        
        if (diff > 0) {
            System.out.println("The date entered is before the current date.");
            System.out.println("The number of days between the entered date and the "
                + "current date is: " + diff);
        } else if (diff < 0) {
            System.out.println("The date entered is after the current date.");
            diff = -diff; // this will always keep the difference in days positive
            System.out.println("The number of days between the entered date and the "
                + "current date is: " + diff);
        }
        
    }

}