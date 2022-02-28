/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctis210lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zoya
 */
public class CTIS210Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int introCompProg;  //declaration statement
        introCompProg = 100;  //assignment statement
        //double overallCollegeGPA = 92.1; error message generated in this line when it was declared as int instead of double
        //introCompProg = 75.8; Error message says incompatible types: possible lossy conversion from double to int

        int Applicant = 7;
        int IntrotoCompProg = 86;
        int AdvancedCompProg = 89;
        int OperatingSystems = 93;
        int Networking = 64;
        int DatabaseSystems = 81;
        int Algorithms = 69;
        double overallCollegeGPA = 92.1; //from line 21

        System.out.println("Intro to Comp Prog\t" + introCompProg);

        System.out.println("Advanced Comp Prog");

        System.out.println("Operating Systems\tNetworking");

        //-----------------------------------------------------------------------------------------------------------------------------
        System.out.println("\nApplicant " + Applicant);

        System.out.println("Intro to Comp Prog\t" + IntrotoCompProg);

        System.out.println("Advanced Comp Prog\t" + AdvancedCompProg);

        System.out.println("Operating Systems\t" + OperatingSystems);

        System.out.println("Networking\t\t" + Networking);

        System.out.println("Database Systems\t" + DatabaseSystems);

        System.out.println("Algorithms\t\t" + Algorithms);

        System.out.println("Overall College GPA\t" + overallCollegeGPA);
        

        IntrotoCompProg = 90; //reassigned value

        System.out.println("\n" + IntrotoCompProg);
        
      
        
    }
}



