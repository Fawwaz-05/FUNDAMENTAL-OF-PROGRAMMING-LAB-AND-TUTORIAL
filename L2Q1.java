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
public class L2Q1 {
    public static void main(String[] args) {
        
        
        Scanner user_input = new Scanner(System.in);
        System.out.print("ENTER THE TMPERATURE IN DEGREE FAHRENHEIT : ");
        double fah = user_input.nextDouble();
        
        
        double result = (fah-32)/1.8 ;
        
        System.out.printf("FOR TEMPERATURE IN CELSIUS IS : "+"%.2f%n"+result);
    }
    
}
