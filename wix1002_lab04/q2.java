/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab04;

/**
 *
 * @author simjiayi
 */
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = in.nextInt();
        int sum = 0;
        
        
        for (int i = 0 ; i <= n ; i++){ 
            sum +=i;
          
        }
        System.out.println(sum);
        
        
    }
    
}
