/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatasks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ELMonitor
 */
public class JavaTasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        /*
        Write a program and ask the user to enter a few words separated by a space. 
        Use the words to create a variable name with PascalCase. For example, if the user types: "number of students",
        display "NumberOfStudents". Make sure that the program is not dependent on the input. So, if the 
        user types "NUMBER OF STUDENTS", the program should still display "NumberOfStudents".
        */
        
        System.out.println("Enter a Few Words Separated By a Space");
        Scanner sc = new Scanner(System.in);
        //Read From The User
        String PascalCase = sc.nextLine();
        //Change The String To Lower Case
        PascalCase = PascalCase.toLowerCase();
        //Create Array of Strings From The String and Mark Each Space To be counted as The end of each item 
        String words[] = PascalCase.split(" "); 
        //For loop To Change The Frist Char of Every charcter From The array To Cpiatlized
        for(int i = 0 ; i < words.length ; i++)
        {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        //Convert Array Of Strings To a String and Remove The Spaces
         String str = String.join("", words);
         System.out.println(str);

}  
    }
    
