/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lesson_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("n= ");
        int n=s.nextInt();
        
        n=(n/3600)%60;
        
        
        
        System.out.println("n= "+n);
    }    
}
