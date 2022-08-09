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
        
        System.out.println("Enter a Word");
        Scanner sc = new Scanner(System.in);
        String Word = sc.next();
        int Counter = 0;
        for(int i = 0; i< Word.length();i++)
        {
        if(Word.charAt(i)=='a' || Word.charAt(i)=='e' || Word.charAt(i)=='o' || Word.charAt(i)=='u' || Word.charAt(i)=='i')
        {
            Counter++;
        }

        }
        System.out.println("Vowels = " + Counter);
        
}  
    }
    
