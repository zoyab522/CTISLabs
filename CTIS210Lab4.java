/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctis210lab4;

/**
 *
 * @author zoya
 */
public class CTIS210Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String applicantName = new String("Charles Babbage"); //applicant name not used

        applicantName = "Ronald Weasely";

        System.out.println("The length of the string applicantName is "
                + applicantName.length() + "."); //prints the length of the applicant name (includes spaces)

        String sUpper = applicantName.toUpperCase(); //changes applicant name to all uppercase letters
        System.out.println("The name of the applicant is " + sUpper);

        String sLower = applicantName.toLowerCase(); //changes applicant name to all lowercase letters
        System.out.println("The name of the applicant is " + sLower);

        System.out.println("The name of the applicant is " + applicantName);

        System.out.println("The character at index 13 is "
                + //the index range depends on the number of characters in the applicant name
                applicantName.charAt(13) + "."); //for "Ronald Weasely" index range is from [0, 13]

        String sLonger = applicantName.concat(" is the best applicant"); //adds the applicant name to the string " is the best applicant"
        System.out.println(sLonger);

        String sReplace = applicantName.replace('a', 'x'); //uses replace method to replace all letters that start with 'a' with 'x' instead
        System.out.println("The line sReplace outputs " + sReplace);

        String sSub = applicantName.substring(0, 6); //offset = 0, endIndex = 6 for all the characters in the name "Ronald"
        System.out.println(sSub); //will only print applicant's first name
        System.out.println("-----------------------------------------------------");

        //---------------------------------------------------------------------------------------------------------------------------------//
        //More Complex Messages
        String FullName = "Hermione Jean Granger";

        String firstname = FullName.substring(0, 8);
        System.out.println("First name is " + firstname);
        String middlename = FullName.substring(9, 13);
        System.out.println("Middle name is " + middlename);
        String lastname = FullName.substring(14, 21);
        System.out.println("Last name is " + lastname);
        System.out.println("Full name is " + FullName);
        System.out.println("-----------------------------------------------------");

        //Pulling the pieces together
        String newname = ("pEneLope clEarWAter");

        int spaceLocation = newname.indexOf(' ');
        int FullLength = newname.length();

        /* Unused statements:
        System.out.println(spaceLocation); outputs 4
        System.out.println(full); ouputs 11
        int plusone = (spaceLocation + 1); (this is an unused variable) */
        int plustwo = (spaceLocation + 2); //the first letter of the last name

        String lowercase = newname.toLowerCase(); //makes the full name lowercase

        String first = newname.substring(0, 1).toUpperCase()
                + lowercase.substring(1, spaceLocation); //capitalizes first letter of first name, makes the rest lowercase

        String last = newname.substring(spaceLocation, plustwo).toUpperCase()
                + newname.substring(plustwo, FullLength).toLowerCase(); //capitalizes first letter of last name, makes the rest lowercase

        System.out.println(first + last); //prints name with corrections
        
        //---------------------------------------------------------------------------------------------------------------------------------//
        
        System.out.println("\n" + "Optional Exercise" + "\n");
        
        //Optional Exercises//
       
        String TestName = "Minerva McGonagall";
        
        int FirstChar = TestName.indexOf('o'); //finds the index of the first occurence of the letter 'o'
                
        String sFirstReplace = TestName.replaceFirst("o", "x"); //use replaceFirst method to replace the first occurence of 'o' with 'x'
        
        System.out.println(sFirstReplace);
        
        double salesTax = 90.3 * (0.085 + 0.011);
        
        System.out.println(salesTax);

        
        
        

        


    }

  

}
