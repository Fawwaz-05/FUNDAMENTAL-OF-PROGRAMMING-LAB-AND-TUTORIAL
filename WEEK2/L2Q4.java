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
public class L2Q4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SECOND : ");
        int totalsec = scan.nextInt();
        
        
        int hour = totalsec / 3600 ;
        int remainsec = totalsec % 3600 ;
        int minute = remainsec / 60 ;
        int seconds = remainsec % 60 ;
        
        
        
        System.out.println(totalsec + " SECONDS IS "+hour+" HOURS ,"+minute+" MINUTES"+" AND "+seconds+" SECONDS");
        
    }
    
}
