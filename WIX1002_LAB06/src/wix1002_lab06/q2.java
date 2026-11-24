/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab06;

/**
 *
 * @author simjiayi
 */
public class q2 {

    public static void main(String[] args) {
        int size = 5;

     
        System.out.println("Triangle:");
        for (int i = 1; i <= size; i++) {
            multiPrint(size - i, ' ');       
            multiPrint(2 * i - 1, '*');     
            System.out.println();           
        }

        System.out.println(); 

  
        System.out.println("Diamond:");
       
        for (int i = 1; i <= size; i++) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
     
        for (int i = size - 1; i >= 1; i--) {
            multiPrint(size - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }

  
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
