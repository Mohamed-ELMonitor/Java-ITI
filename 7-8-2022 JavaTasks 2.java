/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatasks;

import java.util.Scanner;

/**
 *
 * @author ELMonitor
 */
public class JavaTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int i = 1;
    int fact = 1;  
    System.out.println("Enter a Number To Calculate Factorial");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(i = 1; i <= num; i++)
    {    
      fact = fact * i;    
    }    
    System.out.println("The Factorial Of " + num +" = " + fact);    
         
}  
    }
    
