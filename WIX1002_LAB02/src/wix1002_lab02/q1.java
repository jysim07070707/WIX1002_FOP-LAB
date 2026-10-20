/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab02;

/**
 *
 * @author simjiayi
 */

import java.util.Scanner;

public class q1 { 
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("What is the temperature in degree Fahrenheit?");
       double fahrenheit = in.nextDouble();
       double celsius = (fahrenheit -32 )/1.8 ; 
       

        System.out.printf(" The temperature in degree Fahrenheit is %.2f" , fahrenheit );
          System.out.printf(" \nThe temperature in degree celsius is %.2f" , celsius );
        
    }

} 