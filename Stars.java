/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author zoya
 */
public class Stars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // print a triangular shape using asterisk characters
        // TODO code application logic here

        final int LIMIT = 10;
        System.out.println("This is Part A of PP 6.7");
        for (int row = 1; row <= LIMIT; row++) {
            // 6.7 Part A
            for (int star = 1;
                    star <= LIMIT - row + 1;
                    star++) 
                System.out.print("*");
                System.out.println();
            }
        
        System.out.println("\n This is Part B of PP 6.7");
        for (int row = 1; row <= LIMIT; row++) {
            // Part B
            
            for (int space = 1; space <= LIMIT - row; space++)
                System.out.print(" ");
            for (int star = 1; star <= row; star++)
                System.out.print("*");
            System.out.println();
            
        }
        
        System.out.println("\n This is Part C of PP 6.7");
        for (int row = 1; row <= LIMIT; row++) {
            // Part C
            for (int space = 1; space <= row - 1; space++)
                System.out.print(" ");
            for (int star = 1; star <= LIMIT - row + 1; star++)
                System.out.print("*");
            System.out.println();
            
        }
        
        System.out.println("\n This is Part D of PP 6.7");
        for (int row = 1; row <= LIMIT / 2; row++) { // top half of the diamond
            // Part D
            for (int space = 1; space <= (LIMIT/2) - row; space++)
               System.out.print(" ");
           for (int star = 1; star <= (row * 2) - 1; star++)
                System.out.print("*");
            System.out.println();
            
        }
        
        for (int row = 1; row <= LIMIT / 2; row++) { // bottom half of the diamond
            for (int space = 1; space <= row - 1; space++)
               System.out.print(" ");
           for (int star = 1; star <= LIMIT - (row * 2) + 1; star++)
                System.out.print("*");
            System.out.println();
            
        }
    }

}


