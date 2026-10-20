/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;
import java.util.Scanner;

/**
 *
 * @author fawwa
 */
public class EXTRATASK {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
        double num = scan.nextDouble();
        
        System.out.println("ENTER WHOLE NUMBER : ");
        int num2 = scan.nextInt();
        
        System.out.printf("1. FORMATING "+"%e%n",num); // scientific notation
        System.out.printf("2. FORMATING "+"%.2f%n",num); // 2 decimal
        System.out.printf("3. FORMATING "+"%5.3f%n",num); // width 5 , 3 decimal 
        System.out.printf("4. FORMATING "+"|%5.2f|%n",num); // take 10 space , right align
        System.out.printf("5. FORMATING "+"%+.5e%n",num); //scientific with + sign
        System.out.printf("6. FORMATING "+"%X%n",num2); //Hexadecimal uppercase
        System.out.printf("7. FORMATING "+"%o%n",num2); // Octal
        System.out.printf("8. FORMATING "+"%x%n",num2); // Hexadecimal Lowecase
        System.out.printf("9. FORMATING "+"%,.2f%n",num); // Comma betwwen the thousand
        System.out.printf("10. FORMATING "+"%.10f%n",num); // 10 decimal number
        
        
        
        
    }
    
}
