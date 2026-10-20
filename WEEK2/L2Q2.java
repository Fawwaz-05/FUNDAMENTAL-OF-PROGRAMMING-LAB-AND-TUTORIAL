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
public class L2Q2 {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE PRICE OF THE CAR : ");
        float p = scanner.nextFloat();
        
        System.out.println("ENTER DOWN PAYMENT : ");
        float D = scanner.nextFloat();
        
        System.out.println("ENTER THE INTEREST RATE IN % : ");
        float R = scanner.nextFloat();
        
        System.out.println("ENTER YOUR LOAN DURATION");
        int Y = scanner.nextInt();
        
        double M ;
        
        
        
        if ( p < 0 || D<0 || Y < 0){
            System.out.println("INVALID INPUT");
        }else{
            M = (p-D)*(1+R*Y/100)/(Y*12);
            System.out.printf("YOUR MONTHLY PAYMENT IS : "+"RM"+"%.2f%n",M);
        }
        

 
        
        
        
        
        
        
        
       
        
      
        
        
        
    }
    
}
