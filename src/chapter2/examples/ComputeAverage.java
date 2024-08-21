package chapter2.examples;

import java.util.Scanner;

// Listing 2.3
public class ComputeAverage {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the numbers
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute the average
        double average = (number1 + number2 + number3) / 3;

        // Display results
        System.out.println("The average of " + number1 + " " + number2
                + " " + number3 + " is " + average);
    }
}
