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

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int n = in.nextInt();
        
        System.out.print("The factors are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                if (i < n) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
    
}
