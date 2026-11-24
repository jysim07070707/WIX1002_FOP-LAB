/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab06;

/**
 *
 * @author simjiayi
 */
import java.util.Scanner;

public class q3 {
    
    public static String reverseInt(String n ){
        
        String reversed = "" ; 
        for (int i = n.length() - 1; i >= 0 ; i--){ 
            reversed += n.charAt(i);
            
            
            
        }
        return reversed;
        
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            String n = in.next();
            System.out.println("Reversed: " + reverseInt(n));
        }
   
        
        
    }
}
