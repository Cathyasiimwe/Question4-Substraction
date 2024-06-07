/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathematics;

import java.util.Random;
import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate two random single-digit integers
        int number1 = random.nextInt(10); // Generates a number between 0 and 9
        int number2 = random.nextInt(10); // Generates a number between 0 and 9
        
        // Ensure number1 is greater than or equal to number2
        if (number1 < number2) {
            // Swap number1 and number2
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        // Display the question to the student
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        
        try ( // Create a Scanner object to read the student's answer
                Scanner scanner = new Scanner(System.in)) {
            int studentAnswer = scanner.nextInt();
            // Calculate the correct answer
            int correctAnswer = number1 - number2;
            // Check the student's answer and display the result
            if (studentAnswer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
            // Close the scanner
        }
    }
}
