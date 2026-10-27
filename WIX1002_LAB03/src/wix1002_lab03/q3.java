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

public class q3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the Sales Volume: ");
        int sales = in.nextInt();
        double com;
        
        if (sales <= 100){ 
           com = 5/100; 
        }
        else if (sales <= 500){ 
            com = 7.5/100;
        }
        else if (sales <= 1000){
            com = 10/100;
        }
        else{
            com = 12.5/100;
        }
        
        System.out.printf("The commision is: %.2f" , (sales * com));
        
        
        
        
        
        
        
    }
    
    
    
}
