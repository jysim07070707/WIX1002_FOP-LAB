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

public class q1 {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two integer numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Enter the operand: ");
        char a = in.next().charAt(0);
        
        switch (a){ 
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case '%':
                    if (num2 != 0) {
                        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    } else {
                        System.out.println("Error: Modulo by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operand.");
                    break;    

        }   
                    
                
        
        
        
        
        
    }
}
