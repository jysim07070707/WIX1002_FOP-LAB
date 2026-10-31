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

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i = 0 , j = 0;
        int [][] points = new int [3][2];
        
        for ( i = 0 ; i < 3 ; i++ ){ 
            for ( j = 0 ; j < 2 ; j++ ){ 
                System.out.print("Please enter number in Column " + (i+1) + " Row " + (j+1) + ": ");
                points[i][j] = in.nextInt();
            } 
        }
        boolean Boomerang = (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) != 
                              (points[2][1] - points[1][1]) * (points[1][0] - points[0][0]);
                              
        System.out.println("Is it a valid boomerang? " + Boomerang);
       
    }
}
