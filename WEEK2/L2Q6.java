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
public class L2Q6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ENTER THE AMOUNT OF WATER IN GRAM :  ");
        float water = scan.nextFloat();
        
        System.out.println("ENTER THE INITIAL TEMPERATURE IN FAHRENHEIT : ");
        float intemp = scan.nextFloat();
        
        System.out.println("ENTER THE FINAL TEMPERATURE IN FAHRENHEIT : ");
        float fitemp = scan.nextFloat();
        
        
        double ficell = (fitemp-32)*0.5556;
        double incell = (intemp-32)*0.5556;
        
        
        double Q = (water/1000)*(ficell - incell) * 4184 ;
        
        System.out.printf("THE ENERGY NEEDED IS : " + "%e%n" , Q);
        
        
        
        
    }
    
}
