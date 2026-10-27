/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab03;

/**
 *
 * @author simjiayi
 */
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         System.out.println("Please enter the value of a,b,c,d,e,f");
         double a = in.nextDouble();
         double b = in.nextDouble();
         double c = in.nextDouble();
         double d = in.nextDouble();
         double e = in.nextDouble();
         double f = in.nextDouble();
         
         double denominator = (a * d) - (b * c);
         double x , y;
         double epsilion = 0.000000001;
         
         if (Math.abs(denominator) < epsilion){ 
             System.out.println("The equation has no solution");
         }
         else { 
            x = ((e * d) - (b * f)) / denominator;
            y = ((a * f) - (e * c)) / denominator;
            
            System.out.println("x = " + x);
            System.out.println("y = " + y);
 
         }
             
         
         
    }
}
