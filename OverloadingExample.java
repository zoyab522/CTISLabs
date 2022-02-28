/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.overloadingexample;

/**
 *
 * @author zoya
 */
public class OverloadingExample {
    
    public static void main(String[] args) {
        
        class Dog {//class dog with 2 constructors
            String name;
            
            Dog(String name) {
                this.name = name;
            }
            
            Dog()
            {
                this("NoName");
            }
            
            //overloading methods
            //Methods within a class can have the same name
            //if they have different parameter lists;
            //This would be called overloading methods
            
            public String DogMethod() {
                return "String DogMethod";
            }
            
            public int DogMethod(int x){
                System.out.println("int DogMethod = ");
                return (x*3);
            }
        }; //
        
        Dog d1 = new Dog("Spots"); //using constructor 1
        Dog d2 = new Dog(); //using constructor 2
        
        System.out.println("d1 name: " + d1.name);
        System.out.println("d2 name: " + d2.name);
        
        System.out.println(d1.DogMethod());
        System.out.println(d2.DogMethod(5));
        
        
    }
    
}
