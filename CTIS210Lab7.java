/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctis210lab7;

import static java.lang.Double.max;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Random;
import java.text.DecimalFormat;

/**
 *
 * @author zoya
 */
public class CTIS210Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random randGenerator = new Random ();
        DecimalFormat fmt = new DecimalFormat("00.00"); //prints leadning and trailing zeroes

        int applicant;
        //applicant = randGenerator.nextInt(900) + 100;
        applicant = randGenerator.nextInt(10);
        System.out.println("Applicant: " + applicant); //prints value random applicant number from 0-9

        double introCompProg;
        introCompProg = 90 * randGenerator.nextDouble() + 10;
        System.out.println("Intro to Computer Programming: " + fmt.format(introCompProg));
        
        double advCompProg;
        advCompProg = 85 * randGenerator.nextDouble() + 15;
        System.out.println("Advanced Computer Programming: " + fmt.format(advCompProg));
        
        //find the maximum value of introCompProg and advCompProg
        double MaximumScore = max(introCompProg, advCompProg);
        System.out.println("Maximum Value of the 2 Scores: " + fmt.format(MaximumScore));
        
        //Two more floating-point variables for two of the other scores from Lab 1:
        double Networking; //Networking
        Networking = 90 * randGenerator.nextDouble() + 10;
        System.out.println("Networking: " + fmt.format(Networking));
        
        double Algorithms; //Algorithms
        Algorithms = 80 * randGenerator.nextDouble() + 20;
        System.out.println("Algorithms: " + fmt.format(Algorithms));
        
        double overallCollegeGPA;
        overallCollegeGPA = 99 * randGenerator.nextDouble() + 1; //range is from 1 to 100
        System.out.println("Overall College GPA: " + fmt.format(overallCollegeGPA)); //prints Overall College GPA between 1 and 100
        
        double averageComputingScore;
        averageComputingScore = (introCompProg + advCompProg + Networking + Algorithms) / 4;
        System.out.println("Average Computing Score: " + fmt.format(averageComputingScore));
        
        //find the maximum value of overallCollegeGPA and averageComputingScore
        double MaximumScore2 = max(overallCollegeGPA, averageComputingScore);
        System.out.println("Maximum Value of GPA and Average Computing Score: " + fmt.format(MaximumScore2));
        
        //Standard Deviation
        double parentheses1 = pow((introCompProg - averageComputingScore), 2);
        double parentheses2 = pow((advCompProg - averageComputingScore), 2);
        double parentheses3 = pow((Networking - averageComputingScore), 2);
        double parentheses4= pow((Algorithms - averageComputingScore), 2);
        double StandardDeviation = sqrt((parentheses1 + parentheses2 + parentheses3 + parentheses4)/(3));   
        System.out.println("Standard Deviation: " + fmt.format(StandardDeviation));
        
    }
    
}
