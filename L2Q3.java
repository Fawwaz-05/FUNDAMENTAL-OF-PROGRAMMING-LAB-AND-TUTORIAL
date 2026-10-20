/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2;
import java.util.Random;
/**
 *
 * @author fawwa
 */
public class L2Q3 {
    public static void main(String[] args) {
        
        Random rand = new Random();
       
        //Check the number
       
        
        int int1 = rand.nextInt(51)+10;
        int int2 = rand.nextInt(51)+10;
        int int3 = rand.nextInt(51)+10;
                
       System.out.println("THE FIRST NUMBER IS : "+ int1);
       System.out.println("THE SECONG NUMBER IS : "+ int2);
       System.out.println("THE THIRD NUMBER IS : "+ int3);
       
       
       double sum = (int1 + int2 + int3)/3.0;
    
    
        System.out.printf("AVERAGE IS : "+"%.2f%n",sum);
 
 
        

    }
    
}
