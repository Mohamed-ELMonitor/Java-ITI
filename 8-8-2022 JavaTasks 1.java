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
        
       //Write a program that reads a text file and displays the longest word in the file.
        
       String Word;
       String LongestWord = "";
       File myFile = new File("E:\\Test.txt");
       Scanner sc = new Scanner(myFile);
       // Scanner sc = new Scanner(new File("E:\\Test.txt"));
       while (sc.hasNextLine()) {
          Word = sc.next();
           if (Word.length() > LongestWord.length()) {
             LongestWord = Word;
           }
       }
       System.out.println("The Longest Word is " + LongestWord);

}  
    }
    
