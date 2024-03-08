/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sujit
 */
public class error {
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for input
            System.out.print("Enter an integer: ");

            // Attempt to read an integer from the user
            int userInput = scanner.nextInt();

            // Display the entered integer
            System.out.println("You entered: " + userInput);

        } catch (InputMismatchException e) {
            // Handle the exception if the user enters a non-integer value
            System.out.println("Error: Please enter a valid integer.");

        } finally {
            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }
    
}
