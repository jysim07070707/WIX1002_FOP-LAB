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


public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Price of the car?");
            double P = in.nextDouble();
            System.out.println("Down payment");
            double D = in.nextDouble();
            System.out.println("Interest rate in %");
            double R = in.nextDouble();
            System.out.println("Loan duration in years");
            double Y = in.nextDouble();
            double M = (P-D) * (1+R*Y/100) / (Y*12);
            
            System.out.printf("The monthly payment is %.2f", M);

	       }

}
