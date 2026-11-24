/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab06;

/**
 *
 * @author simjiayi
 */
public class q4 {
    
    public static int GCD(int num1, int num2) {
        int n, temp;
        
     
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        do {
            n = num2 % num1;
            num2 = num1;
            num1 = n;
        } while (num1 != 0);
        
        return num2;
    }

    public static void main(String[] args) {
        System.out.println(GCD(24, 8));     
        System.out.println(GCD(200, 625));  
    }
}
