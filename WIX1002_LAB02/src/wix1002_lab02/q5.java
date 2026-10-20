/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab02;

/**
 *
 * @author simjiayi
 */
import java.util.Random;

public class q5 {
    public static void main(String[] args){ 
        Random random = new Random();
        int num = random.nextInt(10001);
        int ori_num = num;
        int sum = 0;
        
        while(num >0){ 
            sum += num % 10;
            num /= 10;
                    
        }
        
        
        System.out.println("Random number: " + ori_num);
        System.out.println("The sum of all the digits in the number: " + sum);
        
    
    
    }
    
    
    
    
    
}
