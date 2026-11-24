/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab06;

/**
 *
 * @author simjiayi
 */
public class q1 {

    public static void main(String[] args) {
        System.out.println("The first 20 triangular numbers are:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(getTriangularNumber(i) + " ");
        }
    }

    public static int getTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

