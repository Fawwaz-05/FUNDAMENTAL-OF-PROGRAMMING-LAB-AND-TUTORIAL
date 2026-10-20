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
public class L2Q5 {
    public static void main(String[] args) {
        
       Random rand = new Random(); 
       int sum = 0 ;
       
       int num = rand.nextInt(0,10001);
        System.out.println(num);
        
        for (;num > 0 ; num /= 10){
            sum += num % 10 ;
        }
        
        System.out.println("THE SUM OF THE NUMBER IS : " + sum);
       
    }
}
