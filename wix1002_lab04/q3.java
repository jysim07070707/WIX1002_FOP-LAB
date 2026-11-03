/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_lab04;

/**
 *
 * @author simjiayi
 */
import java.util.*;

import java.util.Scanner;

public class q3 {
   public static double calculateAverage(ArrayList<Double> scores) {
        double sum = 0;

        for (double score : scores) {
            sum += score;
        }

        return sum / scores.size();
    }
    
    public static double calculateStandardDeviation(
            ArrayList<Double> scores, double average) {

        if (scores.size() < 2) {
            return 0;
        }

        double sumSquares = 0;

        for (double score : scores) {
            sumSquares += score * score;
        }

        double numerator = sumSquares
                - (scores.size() * average * average);

        return Math.sqrt(numerator / (scores.size() - 1));
    }
    
    public static void displayStatistics(ArrayList<Double> scores) {
        if (scores.isEmpty()) {
            System.out.println("No scores were entered.");
            return;
        }

        double min = scores.get(0);
        double max = scores.get(0);

        for (double score : scores) {
            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }
        }

        double average = calculateAverage(scores);
        double sd = calculateStandardDeviation(scores, average);

        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", sd);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Double> scores = new ArrayList<>();

        while (true) {
            System.out.print("Enter a score (negative score to quit): ");
            double score = input.nextDouble();

            if (score < 0) {
                break;
            }

            scores.add(score);
        }

        displayStatistics(scores);
        input.close();
        
//        try (Scanner input = new Scanner(System.in)) {
//            double score;
//            double sum = 0;
//            double sumSquares = 0;
//            double min = Double.MAX_VALUE;
//            double max = Double.MIN_VALUE;
//            int count = 0;
//            
//            while (true) {
//                System.out.print("Enter a score (negative score to quit): ");
//                score = input.nextDouble();
//                
//                if (score < 0) {
//                    break;
//                }
//                
//                sum += score;
//                sumSquares += score * score;
//                
//                if (score < min) {
//                    min = score;
//                }
//                
//                if (count == 0 || score > max) {
//                    max = score;
//                }
//                
//                count++;
//            }
//            
//            if (count == 0) {
//                System.out.println("No scores were entered.");
//            } else {
//                double average = sum / count;
//                
//                System.out.println(sum);
//                
//                System.out.printf("Minimum Score: %.0f%n", min);
//                System.out.printf("Maximum Score: %.0f%n", max);
//                System.out.printf("Average Score: %.2f%n", average);
//                
//                if (count > 1) {
//                    double variance =
//                            (sumSquares - (sum * sum / count)) / (count - 1);
//                    
//                    // Protect against tiny negative rounding errors.
//                    variance = Math.max(0, variance);
//                    
//                    double standardDeviation = Math.sqrt(variance);
//                    
//                    System.out.printf("Standard Deviation: %.2f%n",
//                            standardDeviation);
//                } else {
//                    System.out.println(
//                            "Standard deviation requires at least two scores.");
//                }
//            }
//        }
    }
}