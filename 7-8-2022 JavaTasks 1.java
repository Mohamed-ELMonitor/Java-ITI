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
        
        System.out.println("Enter The Height of The Image");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println("Enter The Width of The Image");
        int width = sc.nextInt();
        if(height > width)
        {
            System.out.println("image is portrait");
        }
        else if (width > height)
        {
        System.out.println("image is landscape");
        }
        
}  
    }
    
