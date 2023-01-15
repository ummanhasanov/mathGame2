/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mathgame2;

/**
 *
 * @author Umman Hasan
 */
import java.util.Random;
import java.util.Scanner;

public class MathGame2
{

    public static void main(String[] args) {
        int points = 0;
        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (keepPlaying) {
            // Generate two random numbers between 1 and 10
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            // Prompt the user to add the numbers
            System.out.println("What is " + num1 + " + " + num2 + "?");
            int answer = scanner.nextInt();

            if (num1 + num2 == answer) {
                // If the answer is correct, add a point
                points++;
                System.out.println("Correct! You have " + points + " points.");
            } else {
                // If the answer is incorrect, don't add a point
                System.out.println("Incorrect. The correct answer is " + (num1 + num2));
            }

            // Ask the user if they want to keep playing
            System.out.println("Would you like to keep playing? (y/n)");
            char keepPlayingChar = scanner.next().charAt(0);
            if (keepPlayingChar == 'n') {
                keepPlaying = false;
            }
        }

        // Game over
        System.out.println("Game over. You scored " + points + " points.");
    }
}
