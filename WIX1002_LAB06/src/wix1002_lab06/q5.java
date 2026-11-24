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
import java.util.Random;

public class q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int result;
        int totalScore = 0; 
        
        do {
            int num1 = rand.nextInt(13);
            int num2 = rand.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(num1 + " x " + num2 + " = ");
            result = in.nextInt();
            
          
            if (result >= 0) {
                totalScore += score(num1, num2, result);
            }
            
        } while (result >= 0);
        

        System.out.println("Your Score is " + totalScore);
    }
    

    public static int score(int num1, int num2, int result) {
        int answer = num1 * num2;
        int score = 0;
        if (answer == result) {
            score++;
        }
        return score;
    }
}
