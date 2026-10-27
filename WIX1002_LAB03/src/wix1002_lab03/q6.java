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

public class q6 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double r = in.nextDouble();
        System.out.println("PLease enter the coordinate point (x,y)");
        System.out.print("x: ");
        double x = in.nextDouble();
        System.out.print("y: ");
        double y = in.nextDouble();
        
        double distanceSquared = (x * x) + (y * y);
        double radiusSquared = r * r;

        if (distanceSquared <= radiusSquared) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }

                
     
    }
}
