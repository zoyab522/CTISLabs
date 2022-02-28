/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mystaticexample2;

/**
 *
 * @author zoya
 */
public class MSE21 {
    
    private static String MyStaticString = "CTIS310";
    private String college = "GUILFORD";
    public static int NumberOfStudents = 18;
    
    private void modify() {
        
        System.out.println("\nInside the private void modify() method.");
        System.out.println(MyStaticString + " - This is a fun course");
        System.out.println("Accessing 'College': "
            + "\nprivate non-static string variable " 
                + "\n of MSE2 outer class");
        System.out.println(college + " Go Quakers; ");
        System.out.println("\nThe Number of Students" 
                + NumberOfStudents);
        
        NumberOfStudents +=10;
        
        System.out.println("\nThe New Number of Students: " 
                + NumberOfStudents);   
    }
    
     public void adjust() {
        
        System.out.println("\nInside the public void adjust() method.");
        System.out.println(MyStaticString + " - This is a exciting course");
        System.out.println("Accessing 'College': "
            + "\nprivate non-static string variable " 
                + "\n of MSE2 outer class");
        System.out.println(college + " When is your graduation date? ");
        System.out.println("\nThe Number of Students" 
                + NumberOfStudents);
        
        NumberOfStudents +=1;
        
        System.out.println("\nThe New Number of Students in the adjust method : " 
                + NumberOfStudents);   
        
    }
     
    public static void transform() {
         System.out.println("\nInside the public static void transform() method.");
        System.out.println(MyStaticString + " - This is a hard course");
        System.out.println(" 'We cannot access college' "
            + "\nbecause it is a private non-static String variable"
            + "\nof the MSE2 outer class and the transform method is a public static method");
        //System.out.println(college + " When is your graduation date? ");
        System.out.println("\nThe Number of Students transformed: " 
                + NumberOfStudents);
        
        NumberOfStudents +=2;
        
        System.out.println("\nThe New Number of Students in the transform method : " 
                + NumberOfStudents);   
        
    }
    
    //---------------------------------------------------------------------------------------------------
    
    static class MyNestedStaticClass {
        public static int numberOfTeachers = 2;
        
        public void display() { //this is a non static method
            
            /*
            Note that if you make the myStaticString variable of the outer class non static
            then you will get a compliation error bc a nested static class cannot access non static members
            of the outer class
            */
            
            System.out.println("Inside the public void display() method" 
                + "\nof the MyNestedStaticClass inner class");
            System.out.println("myStaticString: " + MyStaticString);
            //System.out.println("College: " + college);
            System.out.println("\nThe new number of Students in the display method: "
                + NumberOfStudents);
            
            NumberOfStudents +=3;
            
            System.out.println("\nThe new number of Students in the display method: "
                + NumberOfStudents );
            
        }
        
        public static void change() {
            System.out.println("inside the public static void change() method "
                + "\nof the MyNextedStaticClass inner class");
            System.out.println("Advanced Java Programming: " + MyStaticString);
            //System.out.println("College: " + college);
            System.out.println("\nThe number of Students in the change method: "
                + NumberOfStudents );
            NumberOfStudents +=4;
            System.out.println("\nThe new number of Students in the change method: "
            
            + NumberOfStudents );
        }
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
        to create instance of a nested class we did not need the outer class instance but for a regular
        class nested class, you would need to create an instance of outer class first
        */
        
        MSE21.MyNestedStaticClass object1 = new MSE21.MyNestedStaticClass();
        object1.display();
        object1.change();
        
        MSE21.MyNestedStaticClass object2 = new MSE21.MyNestedStaticClass();
        object2.display();
        object2.change();
        
        MSE21 ObjectMSE2 = new MSE21();
        ObjectMSE2.modify();
        ObjectMSE2.adjust();
        
        //adjust();
        
        transform();
        ObjectMSE2.transform();
    
    }
    
}
